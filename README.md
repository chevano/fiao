# fiao

Project 1: Compute the frequencies of characters in a given input file.
 (Ignore all tabs, spaces and line returns)	     

Please note: 
(1) You may NOT hard code the input and output file names in your program,
	you will get -2 pts for doing so!!!

(2) Your on-line submission MUST follow the on-line submission specs, including the subject heading in your email submission and the name of your Java/C++ code.

(3) Your hard copy submission MUST follow the hard copy submission specs.

 // Since you are all expert in Java, so, it should take no more than an hour of two to do this project.

**************************************
Project points: 8
Language:  Java
Due date:  Soft copy: 9/02/2019 Monday before Midnight
	-1 pt for one day late : 9/03/2019 before Midnight
	-3 pt for two days late : 9/04/2019 before Midnight

Due date:  Hard copy: 9/03/2019 Tuesday in class 
	Since there is no class on 9/04 Thursday,
all late hard copies need to place under office (A218) door by 9/05.

*************************************

I. InFile: a txt file (use argc[0])
	
	
II. OutFile: a txt file (use argc[1]) with the following format:

**** >>>(DO NOT print any characters that have zero count.)
   
	char1  count
	char2  count
	char3  count
	char4  count
	:
	:
	:
	
*******************************
III. Data structure:
*******************************
	- charIn (char)
	- index (int)
	- charCounts[256] 
a 1D array where 256 is max number of different asci characters.
	
   	- printAry ()
	

*******************************
VI. main(. . .)
*******************************
  
step 0: inFile ← open input file
   outFile ← open output file
	   
   - initialize charCounts array to zero.
	   
step 1: charIn <- get the next character from inFile, one character at a time

step 2: index <- cast charIn to integer

step 3: charCounts[index]++

step 4: repeat step 1 to step 3 while inFile is not empty

step 5: printAry () // Print the charCounts array according to the format
			// given in the above.

step 6: close all files


