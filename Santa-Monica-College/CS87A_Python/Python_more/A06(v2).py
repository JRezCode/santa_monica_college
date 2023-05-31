import tkinter


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
    self.__CANVAS_WIDTH = 320   # Canvas  width
    self.__CANVAS_HEIGHT = 240 # Canvas  height
    self.__top5 = Top5Data()
    self.__pop_percentage = self.__top5.get_percent_population()
    self.__pm25 = self.__top5.get_percent_population()
    self.__country_list = self.__top5.get_countries()

    # Create  the  main  window.
    self.main_window = None
    self.canvas = None

  def draw_piechart(self):
    self.main_window = tkinter.Tk()  # Create  the  Canvas  widget.
    self.canvas = tkinter.Canvas(self.main_window ,
                                 width=self.__CANVAS_WIDTH ,
                                 height=self.__CANVAS_HEIGHT)
    #
    # your  code  for  drawing  the pie  charts  goes  here
    # use  program  13-19 as an  example  for how to use
    # the  create_arc  method  of the  tkinter
    # canvas  drawing  object
    #
    color_list=['blue','yellow','green','cyan','magenta']
    start=0; i=0
    for val in self.__pop_percentage.values():
      deg=int(val*360/100)
      self.canvas.create_arc(10,10,230,230, start=start, extent=val*360/100, fill=color_list[i])
      start+=deg
      i+=1
      if(i==len(self.__pop_percentage)):
        self.canvas.create_arc(10,10,230,230, start=start, extent=(360-start), fill='red')


    for v in self.__pop_percentage.values():
      v+=v


      

    self.canvas.pack()
    tkinter.mainloop()

# Create  an  instance  of the  ChartTop5  class.
ui = ChartTop5()
ui.draw_piechart()
