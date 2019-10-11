**_MESOABSTRACT_**

* For this project we need an abstract class for MesoInherit to use so we create this and create two abstract methods for MesoInherit.


**_MESOINHERIT_**

* This class extends MesoAbstract so it inherits all of it's methods. I initialize some private variables to eliminate magic numbers and make my life easier.

* MesoInherit method will take in mesoStation from the driver.

* calAverage will calculate the average of the 4 elements from mesoStation and floors, ceilings, or rounds them and saves those numbers into an avgArray that is returned for later.

* letterAverage takes the result from calAverage and returns the third index of the array calAverage returns.

**_LetterAvg_**

* This class will calculate what stations begin in a certain letter. I initialized input and (ArrayList) matchStationList which hold those said stations to make my life easier. 

* LetterAvg initializes input.

* numberOfStationsWithLetterAvg will return number of matches, If the first character is similar to the input, we increment numMatches.

* toString will output out data in a nice looking format. I used the join and format function to make the desired effect.


**_PosAvg_**

* This class will read in the mesonet.txt file for other methods and classes to use. I initialized some variables at the top to get rid of magical numbers. stationsIDs is the arrayList that holds all of the mesonet.txt stations

* arrayListReturn just returns stationIDs

* fileRead will read in the file and parse it into the arraylist just like project 1.

* indexOfStation will get the index of the city and return it incremented by one.

* toString is very similar to the other toString but this time I only used String.format. This gives us the desired format for the output.