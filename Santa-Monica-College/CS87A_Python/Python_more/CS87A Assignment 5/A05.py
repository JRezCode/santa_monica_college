#########################Begins here############################
# Class/Section: CS87A
# Student ID: 1654919
# Name: Jonathan Reznik
#
# Notes/Issues
#   For some bizarre reason 1 country in the air quality data isn't located
# within the population file.  I have used a constant variable to replace the
# missing population of Myanmar, which does the analyasis without corrupting
# the remaining functions but does introduce some possible questionable data into
# the picture.  The constant is recorded prior to the file input reading so that
# should that data be made available in another .tsv file that it would write over
# that value in the dictionary.
#


# A function that reads in the air quality data
# RETURNING A DICTIONARY WITH a list container for values
def make_avg_pm2_dictionary():
  f_read = open('air_data.tsv','r', encoding = "ISO-8859-1")
  line = f_read.readline()

  air_q = {}
  A = air_quality_dict = air_q
  

  for entry in f_read.readlines():      
    key=entry.split(sep="\t")[0]
    pm2=entry.split(sep="\t")[6]
    if key in air_quality_dict:
      air_q[key]+=[pm2]
#      A[key][0]+=1
#      A[key][1]+=int(float(entry.split(sep="\t")[6]))
    else:
      air_q[key]=[pm2]
#      air_q[key]=[1,int(entry.split(sep="\t")[6])]
#  for key in air_q.keys():
#    A[key].append(air_q[key][1]/air_q[key][0])

  for country in A.keys():
    total=0
    for i in A[country]:
      total+=int(float(i))
    A[country].append(total/len(A[country]))
  return(air_quality_dict)

##    for key,value in air_q.items():
##      count=len(value)

##    for key,value in air_q.items():
##      for i in value:
##        print(i)
###        total+=int(float(value[i]))
  

# Read in cia population and create a dictionary with population and average pm2 data
# for each country.  Accepts a dictionary argument and returns expanded dictionary
# with population and air quality data.
def add_cia_population_data(aqd):

  #Creates a new dictionary that stores key/values for just the average only
  pm2_avg={}
  for key,value in aqd.items():
    pm2_avg[key]=[value[-1]]
  #This block is because of Myanmar missing from CIA population tsv file
  #therefore the population is needed to include in final output
  #source: worldpopulationreview.com
  POPULATION_OF_MYANMAR = 54043923
  pm2_avg['Myanmar']+=[POPULATION_OF_MYANMAR]
  
  #Function should usually begin here  
  f_read = open('cia_population.tsv','r', encoding = "ISO-8859-1")
  for entry in f_read.readlines():
    target=entry.split(sep="\t")
    if target[1] in pm2_avg:
      pm2_avg[target[1]]+=[int(entry.split(sep="\t")[2])]
  return pm2_avg

# print countries with air quality exceeding WHO's guidelines
# The function accepts two args a dictionary and numeric value for threshold
def print_exceed_threshold(data,threshold):
  sort_dictionary=sorted(data.items())
  print(sort_dictionary)
  for key,value in sort_dictionary:
    if value[0]>threshold:
      print(format(key, '20'), format(value[1], '13,'), format(value[0], '.2f'), sep="\t\t")

def main():
    avg_pm2 = make_avg_pm2_dictionary()
    country_data = add_cia_population_data(avg_pm2)
    print_exceed_threshold(country_data,35)

main()
