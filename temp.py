# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

import cv2
import numpy as np

face_cascade=cv2.CascadeClassifier('cascade/data/haarcascade_frontalface_alt2.xml')
cap = cv2.VideoCapture(0)


while(True):
    # Capture frame-by-frame
    ret, frame = cap.read()

    # Our operations on the frame come here
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    faces= face_cascade.detectMultiScale(gray, scaleFactor=1.5, minNeighbors=5)
    for(x,y,w,h) in faces:
        print(x,y,w,h)
        roi_gray=gray[y:y+h,x:x+w]
        roi_color=frame[y:y+h,x:x+w]
        img_item="my-img.png"
        cv2.imwrite(img_item,roi_gray)
        color=(255,0,0)    #bgr for rectangle
        stroke=2#thickness of rectangle
        end_cord_x=x+w
        end_cord_y=y+h
        cv2.rectangle(frame ,(x,y),(end_cord_x,end_cord_y),color,stroke)
    # Display the resulting frame
    cv2.imshow('frame',frame)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

# When everything done, release the capture
cap.release()
cv2.destroyAllWindows()