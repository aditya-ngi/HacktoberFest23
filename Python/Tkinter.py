from tkinter import *
from tkinter import messagebox
x=Tk()
x.geometry("500x500")
username=Label(x,text="Enter your name: ").pack()
u1=Entry(x).pack()
def fun():
    a=u1.get()
    print(a)
btn1=Button(x,text="CLICK ME!",command=fun,fg="Blue",bg="Red")
btn1.pack()

x.mainloop()
