#########################Begins here############################
# Class/Section: CS87A
# Student ID: 1654919
# Name: Jonathan Reznik
# Submission Date:  Wed, 11/21/2018
#
#
# Notes/Issues
#   1. For some bizarre reason the air quality data does not have data for Myanmar.
#   2. Setting the threshold to a lower value will expose another problem:
#       That is for Korea,South  I think the comma is causing problems in comparing
#       strings across files for data searching.
#       This problem was considered secondary according to the requirements since
#       threshold was meant to be used is 35 mg/m^3
#
#

# READS IN DATA & RETURNING A DICTIONARY (LIST VALUE FOR KEY-VALUE PAIR)
def make_avg_pm2_dictionary():
  f_read = open('air_data.tsv','r', encoding = "ISO-8859-1")
  line = f_read.readline()

  A = air_quality_dict = air_q = {}
  
  for entry in f_read.readlines():      
    key=entry.split(sep="\t")[0]
    pm2=entry.split(sep="\t")[6]
    if key in air_quality_dict:
      air_q[key]+=[pm2]
    else:
      air_q[key]=[pm2]

  for country in A.keys():
    total=0
    for i in A[country]:
      total+=int(float(i))
    A[country].append(total/len(A[country]))

  for key,value in A.items():
    A[key]=[value[-1]]

  return(air_quality_dict)

# ACCEPTS A DICTIONARY AND RETURNS A DICTIONARY (WITH POP. AND PM2 DATA PER COUNTRY)
def add_cia_population_data(pm2_avg):
  #This is the missing data 
  pm2_avg['Myanmar']+=[54043923]  

  f_read = open('cia_population.tsv','r', encoding = "ISO-8859-1")

  for entry in f_read.readlines():
    d=entry.split(sep="\t")
    if d[1] in pm2_avg:
      pm2_avg[d[1]].append(int(d[2]))
  return pm2_avg

# ACCEPTS DICTIONARY AND A NUMBER VALUE TO SHOW OUTPUT BEYOND WHO'S THRESHOLD
def print_exceed_threshold(data,threshold):
  sort_dictionary=sorted(data.items())
  for key,value in sort_dictionary:
    if value[0]>threshold:
      print(format(key, '20'), format(value[1], '13,'), format(value[0], '.2f'), sep="\t\t")

#LEFT UNTOUCHED EXCEPT FOR THE LINE BREAKS
def main():
    avg_pm2 = make_avg_pm2_dictionary()
    country_data = add_cia_population_data(avg_pm2)
    print_exceed_threshold(country_data,25)

main()
