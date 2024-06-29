#########################Begins here############################
# Class/Section: CS87A
# Student ID: 1654919
# Name: Jonathan Reznik
#
# Assignment Goals
# 1. use file io to read in air quality data
# 2. store population and air quality data in dictionaries
# 3. Use functions that pass and return dictionaries
# 4. Analyze data and print the output formatted in a nice way
#

def make_avg_pm2_dictionary():
  COUNTRY_COLUMN =0
  PM2_COLUMN = 6

  #a blank dictionary and an alias to it
  air_quality_dict = {}
  a = air_quality_dict

  #priming read of file input to get rid of the headers (inside a try/except suite)
  try:
    f_read = open('air_data.tsv','r', encoding = "ISO-8859-1")
    line = f_read.readline()
  except:
    print("The file is inaccessible to be able to continue the file needs to be made accessible. Somehow.")

  
  #Begin reading file line by line and split method to put key value pairs into a list
  for entry in f_read.readlines():
    raw_data=entry.split(sep="\t")  

    #convenient names for these key,value pairs while populating it
    keys=raw_data[COUNTRY_COLUMN]
    values=raw_data[PM2_COLUMN]

    if keys not in air_quality_dict:
      air_quality_dict[keys]=[1,int(values)]
    else:
      a[keys][0]+=1
      a[keys][1]+=int(float(values))

  #now calculate the average by accessing the keys with items() method
  for k in air_quality_dict.keys():
    a[k]=a[k][1]/a[k][0]
  return(air_quality_dict)


#
# function that takes a dictionary of air quality for each country (aqd)
# and returns a dictionary with the population and air quality for each country
# if that country has air quality data
#
def add_cia_population_data(aqd):
  country_population={}
  
  return {}
#
# print out country name, population, and  pm2 values
# that exceed the WHO's threshold (in ug/m3) for 1 year pm2 levels
# that increase long-term mortality risk by 15% from figure 1
# Print the data sorted by the last name of the country
#
def print_exceed_threshold(data,threshold):
#
# your code goes here
#
    print()
#
# call all the functions
#
def main():
# Build dictionary from air quality file
    avg_pm2 = make_avg_pm2_dictionary()
    print(avg_pm2)
# Read in cia population and create a dictionary
# with population and average pm2 data for each country
    country_data = add_cia_population_data(avg_pm2)
# print countries with air quality
# exceeding WHO's guidelines
    print_exceed_threshold(country_data,35)
    x=5
    print(x)
#
#run the analysis
#
main()
