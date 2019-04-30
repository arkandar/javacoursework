# CS1410 Project
# SPEC: https://vle.aston.ac.uk/bbcswebdav/pid-1506546-dt-content-rid-10007428_1/courses/2018_CS1410/cs1410spec19%284%29.pdf
To complete the code first read through all the classes/UML to try and understand what each class is for
All of the parts that say // TODO are parts that need to be completed
Completed classes - Location, Direction
We might still need to create new classes so if you think there needs to be one create it
Whatever you work on add your name to the comments at the top
Upload classes to https://drive.google.com/drive/folders/13Dja_yqe9oeNYAFglPW1xA3o04b4pr_X?usp=sharing
Try and comment using javadoc style: https://vle.aston.ac.uk/bbcswebdav/pid-1477057-dt-content-rid-9612836_1/courses/2018_CS1410/2018_CS1410_ImportedContent_20190111041631/l7slides.pdf

* ~Complete the Action enum - needs all of the different actions like forward/rotate, example on https://vle.aston.ac.uk/bbcswebdav/pid-1526778-dt-content-rid-9991493_1/courses/2018_CS1410/tutorial3-design.pdf
(outline already done, could be changed)~
* Complete the Robot class
  - add a Direction variable
  - act(Action a) should use the Action enum to perform an action on the robot - only do this if Action enum is finished
  it should check what type of action
  - destroy() should put the robot back at the starting location, which could be a variable
  - (difficult)push should have a parameter of type Direction and it should move the robot using the Action enum and the Direction
  - Add a method called setLocation which takes x (int) and y (int) as parameters which makes a new Location using the parameters
* Complete Player class
  - add an ArrayList called ActionList which has type Action
  - add a line to the Constructor for initialising the ArrayList
  - add a method called addAction which has parameter of type Action, which adds the action to the ArrayList
  - (difficult) make a method to check if there two actions in a row in the array
 * Complete Flag class
   - (difficult) notifyGame() should tell the game that one of the flags has been touched and by what player, maybe using player/robot/game as a parameter
   - react should use the notifyGame() method and give the Robot in it as a parameter
 * Complete Gear class
   - add a gearType variable which is a String
   - Constructor should take gearType as a parameter and assign it to the class variable 
   - react should rotate the robot using r.act(LEFT) or r.act(RIGHT) which happens depending on what type the gear is 
 * Complete Pit class
   - react should destroy the robot using r.destroy()










 The ​task​ is to ​implement​ a ​grid-based board game​, where you ​race ​with your ​robot​ to ​touch all the ​flags​ on the ​board​ in order (first ​player​ to do that ​wins​). It is essentially a heavily simplified version of ​Robo Rally​, from​ Wizards of the Coast​: ​look ​it up if it ​sounds ​interesting!  
 The ​robots​ ​start ​on​ predetermined positions​ on the ​board​ ​facing ​north, and a ​player​ ​gets ​the first ​player marker​. Each ​round​ consists of these ​steps​:  1. The ​players​ ​program ​their ​robots​ with a sequence of 5 different ​actions​. These can be “​move Forward​ one ​space​” (F), “​Back up​ one ​space​” (B), “​rotate​ 90 degrees Left” (L), “​rotate 90 degrees Right” (R), “​do a U-turn​” (U), or “​Wait​” (W).  You ​may not repeat ​an ​action​ twice in a row: “FFLWF” is not valid, but “FWFLF” would be valid. It would be boring and unfair if everyone simply ​played ​“FFFFF” all the time!  2. Robots will ​operate ​in ​player order​, ​executing ​the ​action​ in the first ​slot​, then the ​locations where the ​robots ​are will ​activate​, and the first​ player token​ ​passes ​to the next ​player​. This is repeated ​with the second, third, fourth and fifth ​slots​.  
 As an example, with player A and player B having decided on “FLFWF” and “WFWFL”, and with A starting with the first player token, this will happen:  (a) A “F” is executed, then B “W”. Board activates. First player token passes to B.  (b) B “F” is executed, then A “L”. Board activates. First player token passes to A.  (c) A “F” is executed, then B “W”. Board activates. First player token passes to B.  (d) B “F” is executed, then A “W”. Board activates. First player token passes to A.  (e) A “F” is executed, then B “F”. Board activates. First player token passes to B.  
 
 There are some additional rules for movement:  • If a ​robot​ ​moves​ into a ​position​ ​occupied​ by another ​robot​, it ​pushes​ that other ​robot​ one space​ away in the same ​direction​. The ​robot​ ​being pushed​ may ​push​ another ​robot​, and so on. • If a robot ​moves​ outside the ​board​, it is ​destroyed​. ​Move​ the ​robot​ back to its ​starting position​. If the ​starting position​ is ​occupied​, ​try​ the ​position​ adjacent to the north, then east, south, and finally west.  There are two types of ​locations​ that ​react​ to ​robots​ ​entering​ them:  • ​Flags​ will ​notify​ the ​game​ that a ​robot​ ​entered​ it. The ​game​ will ​track​ if that was the next flag​ in the ​sequence​ for the ​robot​, or not.  • ​Pits​ will ​destroy​ your ​robot​. ​Move​ it back to its ​starting position​, just as if it had ​moved outside the ​board​. There is one type of ​location​ that ​manipulates​ ​robots​ upon ​activation​, after all ​robot​ ​moves​ in an ​action slot​ have been resolved: ​gears​. They can ​rotate​ your ​robot​ either clockwise or counter-clockwise by 90 degrees.  To ​activate​ the ​board​,​ go through​ the ​robots​ from the top-left corner to the bottom-right, ​row by ​row​. For each ​robot​, ​find​ any ​special locations​ where they are and ​activate​ them.  A basic version of the game should ​read​ the ​board​ and the programs from a ​file​. The specific formats for these ​files​ are described in Section 5. The basic version of the application would use a text-based user interface (TUI).  The basic requirements allow you to go up to the 60-69 band in the implementation component  of the final submission, according to the marking scheme on Table 2. Section 4 describes a set of advanced requirements which will give you more marks in this component, which includes the creation of a JavaFX-based graphical user interface.  Remember that whether you use a TUI or a GUI, you should show the evolution of the board over the game. This should be done at least once per round, but you could do it between 
 action slots or even individual actions.
