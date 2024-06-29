def make_avg_pm2_dictionary():
  file_in=open('air_data.tsv','r')
  #This file has headers
  file_in.readline()
  line_list=file_in.readlines()

  air_quality={}
  #This for loop is to setup the dictionary
  for line in line_list:
    l=line.split("\t")
    country=l[0]
    pm2=l[6]
    if country in air_quality:
      air_quality[country]+=[pm2]
    else:
      air_quality[country]=[pm2]

  total=0
  for k,v in air_quality.items():
    for items in v:
      total+=int(float(items))
    air_quality[k]=total/len(v)

#  air_quality[country]=int(float(total))/len(air_quality[country])

  return (air_quality)
    
##      air_quality[country][0]=air_quality[country][0]+pm2
##    else:
##      air_quality[country]=[pm2]
##
      
 #   country=
  #This for loop is for averaging 
#  for element in line_list:

 
  print(air_quality)

def add_cia_population_data(aqd):
  file_in=open('cia_population.tsv','r')
  #This file does not have headers - start reading data right away
  line_list=file_in.readlines()
  pm_and_popp={}
  for line in line_list:
    if line.split("\t")[1] in aqd:
      pm_and_popp[]=line.split("\t")[2]
  return pm_and_popp

def print_exceed_threshold(data,threshold):
  result=sorted(data.items())
  for k,v in result:
    if v[]>threshold:
      print(format(, '20'), format(, '13,'), format(, '.2f'), sep="\t")

  
def main():
  avg_pm2 = make_avg_pm2_dictionary()
  print(avg_pm2)

  country_data = add_cia_population_data(avg_pm2)

  print_exceed_threshold(country_data,35)

main()
