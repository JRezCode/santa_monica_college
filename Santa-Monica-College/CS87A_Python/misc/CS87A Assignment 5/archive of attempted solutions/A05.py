#########################Begins here############################
# Class/Section: CS87A
# Student ID: 1654919
# Name: Jonathan Reznik
#
# Assignment Goals
# 1. use file io to read in air quality data
# 2. store data in dictionaries and passing arguments of a dictionary
# 3. write a output function that sorts and analyzes the data in dictionary
#

def make_avg_pm2_dictionary():
    COUNTRY_COLUMN =0
    PM2_COLUMN = 6
    pm_dict = {}
    average_pm = {}
    f_read = open('air_data.tsv','r')
    f_read.readline()
    line=f_read.read()
#	line = f_read.readline()
    eof=False
    while not eof:
            try:
                    pm_data=line.split(sep="\t")
                    if pm_data[COUNTRY_COLUMN] in pm_dict:
                            pm_dict[pm_data[COUNTRY_COLUMN]]+=int(pm_data[PM2_COLUMN])
                            #pm_dict["Count for"+pm_data[COUNTRY_COLUMN]]=1
                    else:
                            pm_dict[pm_data[COUNTRY_COLUMN]]=int(pm_data[PM2_COLUMN])
                            #pm_dict["Count for"+pm_data[COUNTRY_COLUMN]]+=1
            except EOFError:
                    eof=True
                    return pm_dict


#	return average_pm

#
# function that takes a dictionary of air quality for each country (aqd)
# and returns a dictionary with the population and air quality for each country
# if that country has air quality data
#
def add_cia_population_data(aqd):
#
# your code goes here, clean up the data with strip
#
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
