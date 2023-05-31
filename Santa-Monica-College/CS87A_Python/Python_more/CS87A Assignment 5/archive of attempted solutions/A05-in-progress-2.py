COUNTRY_COLUMN =0
PM2_COLUMN = 6

airQ_dict = {}
average_pm = {}

f_read = open('air_data.tsv','r', encoding = "ISO-8859-1")

#priming read of file input to get rid of the headers
line = f_read.readline()

for entry in f_read.readlines():
  rawdata=entry.split(sep="\t")  
  key=rawdata[COUNTRY_COLUMN]
  value = rawdata[PM2_COLUMN]
  if key in airQ_dict:
    airQ_dict[key][0]+=1
    airQ_dict[key][1]+=int(float(value))
#    airQ_dict[key]+=[[1],[entry]]
  else:
    airQ_dict[key]=[1,int(value)]
print(airQ_dict)
#return pm_dict
