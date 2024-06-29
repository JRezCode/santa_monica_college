#########################Begins here############################
# Class/Section: CS87A
# Student ID: 1654919
# Name: Jonathan Reznik
#
# Assignment Goals
# 1. file io
# 2. dictionaries (and parsing file contents into)
# 3. functions and parameters
# 4. formatting of output
#
# Notes/Issues
#   For some bizarre reason I was unable to locate at least 1 country from
# the air quality data in the population file, so as a shortcut rather than
# have to leave the work unfinished I included a constant in the second fn
# for the population of Myanmar, which I researched myself.  By placing it
# before the for loop that reads in the population from file the value is
# safely situation to also be replaced in case the working data file at a
# later time has that specific information available in it.
#


# The function that reads in the air quality data and then calculates
# an average for a given country's entries in the table
def make_avg_pm2_dictionary():
  air_quality_dict = {}
  a = air_quality_dict
  f_read = open('air_data.tsv','r', encoding = "ISO-8859-1")
  line = f_read.readline()
  for entry in f_read.readlines():      
    key=entry.split(sep="\t")[0]
    if key in air_quality_dict:
     a[key][0]+=1
     a[key][1]+=int(float(entry.split(sep="\t")[6]))
    else:
      air_quality_dict[key]=[1,int(entry.split(sep="\t")[6])]
  for key in air_quality_dict.keys():
    a[key].append(air_quality_dict[key][1]/air_quality_dict[key][0])
  return(air_quality_dict)


#
# function that takes a dictionary of air quality for each country (aqd)
# and returns a dictionary with the population and air quality for each country
# if that country has air quality data
#
def add_cia_population_data(aqd):
  population_dict={}
  #A missing Population count from the CIA population file for Myanmar
  #sourcE: worldpopulationreview.com
  POPULATION_OF_MYANMAR = 54043923
  aqd['Myanmar']+=[POPULATION_OF_MYANMAR]
  
  f_read = open('cia_population.tsv','r', encoding = "ISO-8859-1")
  for entry in f_read.readlines():
    if entry.split(sep="\t")[1] in aqd:
      aqd[entry.split(sep="\t")[1]]+=[int(entry.split(sep="\t")[2])]
  return aqd

#
# print out country name, population, and  pm2 values
# that exceed the WHO's threshold (in ug/m3) for 1 year pm2 levels
# that increase long-term mortality risk by 15% from figure 1
# Print the data sorted by the last name of the country
#
def print_exceed_threshold(data,threshold):
  sort_dictionary=sorted(data.items())
  for key,value in sort_dictionary:
    if value[2]>threshold:
      print(format(key, '20'), format(value[3], '13,'), format(value[2], '.2f'), sep="\t\t")

# call all the functions
#
def main():
# Build dictionary from air quality file
    avg_pm2 = make_avg_pm2_dictionary()

# Read in cia population and create a dictionary
# with population and average pm2 data for each country
    country_data = add_cia_population_data(avg_pm2)
# print countries with air quality
# exceeding WHO's guidelines
    print_exceed_threshold(country_data,35)
#
#run the analysis
#
main()
