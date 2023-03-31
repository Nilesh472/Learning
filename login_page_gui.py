from tkinter import *
from PIL import ImageTk,Image
from tkinter import messagebox

def handle_login():
    email = email_input.get()
    password = pass_input.get()
    
    if email == 'nilesh.nky65@gmail.com' and password == '9867607352':
        messagebox.showinfo('Nilesh login')
    else:
        messagebox.showerror('error','You are not Nilesh!')


root = Tk()
root.title('Login form')
# root.iconbitmap('oip.ico')
root.geometry('500x500')
root.minsize(500,500)
root.configure(background='#0096DC')
img=Image.open('lfipkart_logo.jpg')
img_resize = img.resize((70,70))
img = ImageTk.PhotoImage(img_resize)

img_label = Label(root,image=img)
img_label.pack(pady=(10,10))

text_label = Label(root,text='Flipkart',fg='white',bg='#0096DC')
text_label.pack()
text_label.config(font=('verdana',24))

email_label = Label(root,text='Enter Your Email',fg='white',bg='#0096DC')
email_label.pack(pady=(20,5))
email_label.config(font=('verdana',12))

email_input = Entry(root,width=50)
email_input.pack(ipady=6,pady=(1,15))

pass_label = Label(root,text='Enter Your Password',fg='white',bg='#0096DC')
pass_label.pack(pady=(20,5))
pass_label.config(font=('verdana',12))

pass_input = Entry(root,width=50)
pass_input.pack(ipady=6,pady=(1,15))

login_btn = Button(root,text='Login',fg='black',bg='white',command=handle_login)
login_btn.pack(pady=(10,20))

root.mainloop()
