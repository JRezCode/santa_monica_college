import tkinter

TOTAL_POPULATION=3813137727
class  Top5Data:
  def  __init__(self):
    self.__population_percentage = {"China":36.17 ,"India":33.62, "Pakistan":5.37 ,"Nigeria":5.00 , "Bangladesh": 4.12}
    self.__pm25 = {"China":52.05 ,"India":58.54 , "Pakistan":88.00 , "Nigeria":36.42 ,"Bangladesh":78.00}
    self.__countries  =["China","India","Pakistan","Nigeria","Bangladesh"]

  def get_percent_population(self):
    return  self.__population_percentage

  def get_pm25(self):
    return  self.__pm25

  def get_countries(self):
    return  self.__countries;

class ChartTop5:
  def __init__(self):
    self.__CANVAS_WIDTH = 420   # Canvas  width
    self.__CANVAS_HEIGHT = 260 # Canvas  height
    self.__top5 = Top5Data()
    self.__pop_percentage = self.__top5.get_percent_population()
    self.__pm25 = self.__top5.get_pm25()
    self.__country_list = self.__top5.get_countries()

    # Create  the  main  window.
    self.main_window = None
    self.canvas = None

  def draw_piechart(self):
    self.main_window = tkinter.Tk()
    # Create  the  Canvas  widget.
    self.canvas = tkinter.Canvas(self.main_window ,
                                 width=self.__CANVAS_WIDTH ,
                                 height=self.__CANVAS_HEIGHT ,
                                 background='grey80')

    #Adding some basic canvas text to explain
    self.canvas.create_text(180,0,text="Populations of Exceeders in PM2", width=self.__CANVAS_WIDTH, anchor=tkinter.N, font=('Times', '14', 'bold italic'))  
    self.canvas.create_text(240,200,text='other countries', fill='navy', anchor=tkinter.NW)  
    self.canvas.create_text(self.__CANVAS_WIDTH,self.__CANVAS_HEIGHT,text=("Total pop in dataset:"+str(format(TOTAL_POPULATION/1000000,'.1f'))+"mil"), anchor=tkinter.SE)  
    self.canvas.create_text(240,45,text='        pm2     popul.    ', anchor=tkinter.W, font=('Helvetica','12', 'underline')) 
    
    #Drawing the pie chart
    color_list=['maroon','green','purple','brown','grey20']
    next_slice=0;text_space=0;count=0
    for percent in sorted(self.__pop_percentage.values(),reverse=True):
    #for i,percent in enumerate(sorted(self.__pop_percentage.values(),reverse=True)):
      degrees=int(percent*360/100)
      self.canvas.create_arc(10,25,230,245, start=next_slice, extent=degrees, fill=color_list[count])      
      self.canvas.create_text(280, (60+text_space), text=(format(self.__pm25[self.__country_list[count]],'-2.0f')), anchor=tkinter.NW)
      self.canvas.create_text(320,(60+text_space), text=(format(percent,'.1f')+"%"), fill=color_list[count], anchor=tkinter.NW)
      self.canvas.create_text(360,(60+text_space), text=(self.__country_list[count][0:5]), fill=color_list[count], anchor=tkinter.NW)
      next_slice+=degrees
      text_space+=20
      count+=1
    self.canvas.create_arc(10,25,230,245, start=next_slice, extent=(360-next_slice), fill='navy')
    self.canvas.create_line(20+(220*3/4),20+(220*3/4),240,200,fill='cyan')
    self.canvas.pack()
    tkinter.mainloop()


# Create  an  instance  of the  ChartTop5  class.
ui = ChartTop5()
ui.draw_piechart()
ui.label_chart()
