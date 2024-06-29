def make_avg_pm2_dictionary():
    COUNTRY_COLUMN =0
    PM2_COLUMN = 2
    pm_dict = {}
    average_pm = {}    
    f_read = open('air_data.tsv','r')
    f_read.readline()   #a priming read
#    eof=False
 #   while not eof:
    while f_read.readline()!='':
        pm_data=f_read.readline().split(sep="\t")
        if pm_data[COUNTRY_COLUMN] in pm_dict:
            pm_dict[pm_data[COUNTRY_COLUMN]]+=int(pm_data[PM2_COLUMN])
                #pm_dict["Count for "+pm_data[COUNTRY_COLUMN]]=1
        else:
            pm_dict[pm_data[COUNTRY_COLUMN]]=int(pm_data[PM2_COLUMN])
                #pm_dict["Count for "+pm_data[COUNTRY_COLUMN]]+=1#        except EOFError: #           eof=True
    return pm_dict
