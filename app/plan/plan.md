#Plan Weather App

## Requirements:

### Overview
* The goal of this app is to access an api and get data from the internet to show the 
user for a current update on the weather
* The app needs to show the current weather
* show the 7 day forecast
* display where the information pertains to. For example, if the weather info is for bountiful 
Utah then the user must know that
* You should be able to change which city or area that you want to see the weather for
* The area that you have searched should be saved into some sort of data base so when you
open the app the area that you have looked at is remembered by the app and you don't need to 
search through the app everytime for the weather
* should be easy to use

### Things I know
* I know how to use android studio
* I've done some xml and some ui with previous apps
* I've made an app using model view view model
* know how to use basic programming
* I've stored data into a database before with a different app

### Things that I will need to learn
* How to use an api to get info from the internet
* How to best organize and diagram the process of what I want to build
* How to use open source art or graphics for the app and art to make it look good

## System Analysis

### Data
* The data will come from the user on where they would like to know the weather for
* Data for the weather will come from the weather service using an api

### Output
* The information will be displayed to the screen for the weather in the area for the 7 day forcast
* The info for the current day will be in more detail than the following days
* The current day should have the following information available to the user:
  * current temp
  * Hi temp and low temp
  * chance of rain/snow/precipitation
  * current conditions, ie sunny, foggy, cloudy ect.
  * wind speed
  * time until sun up or sundown depending on weather it is night or day time
* the next 6 or 7 days or whatever should display the following info:
  * Hi temp and low temp
  * chance of precipitation
  * predicted conditions

### Algorithms
* Not totally sure which algorithms I will need to use to build this app. I guess that we will see.

## Design

### UI design
* all of the different fragments will need to have a recycler view in them for the lists that will need to
be displayed
* Main activity will just have a fragment container which will then switch fragments depending on what action 
the user takes
* The app will need some buttons for searching and adding different areas to the list of areas that will have
weather info displayed
* 

### backend design

* I should be able to use model view view model or keep everything organized that way
* This means that:
  * all the ui elements will be in the view
  * all the data will be stored in the model 
  * all the communication between the two is done through the view model

* I plan on starting with the ui 
* then maybe the view model then the model, not sure if it will be easier to go with the view model first
or just the model first
* 


