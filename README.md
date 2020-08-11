## NOTICE

This repository contains the public FTC SDK for the SKYSTONE (2019-2020) competition season. It has been modified to provide an example of using state machines in programming. 

It should be noted that this was developed as I helped members of my Scouts BSA troop learn to program a robot. There may be violations of typical Java programming idiom as my background is primarily C# with SQL, JavaScript, and TypeScript. This is my first venture into Java and there is a good chance that it shows.

## Background

Long ago four bright men came together to figure out why some projects worked out better than others and what could be learned from those success stories. They found that successful software often followed some patterns and these men decided to catalog the patterns to the benefit of others. The original catalog has become known as the "Gang of Four." As time has done on, more patterns have emerged sometimes building on the previous patterns. As a note - patterns provide a kid of "template" for creating more software. But they should **note** be blindly followed. Nor are they intended to be overly rigid. They do however help convey a sense of purpose and methodology.

A classic "State Machine" moves from one stable status to another with limits on which states they can transition to and under what circumstance. An easy metaphore is the light switch. It has two states (on and off) and it can be moved between those states. Something happens in the transition. In this case we want to use (and adapt) this pattern to hold a state while the robot is physically positioning itself. Once it reaches one state, the robot will then start the next transition.

** This is a starting point - not the end **

Please use and adapt this code. Do **NOT** think that your code needs to be exactly like this code. A team might move from states of moving and turning to a series of states where the robot should be. This would be more advanced, but you can find the basis for it here.

## Object Oriented Programming

Java (like many programming languages) is an "Object Oriented" language. Meaning that we make objects to represent concepts and things and manipulate those objects. It should be noted that **all** mataphores break down and often they break down more quickly than a software developer would like to think. More importantly, it helps to have a few pieces of information in the back of your mind.

### Four Pillars of Object Oriented Programming (OOP)

There are four pillars upon which OOP is built:
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism

It is easy to "get into the weeds" when discussing these concepts. But know that there are some things we want to happen.
1. We want to be able to discuss a robot moving forward 20 inches, or turning left 35 degrees. (This is abstraction and ideally even if the how changes the what does not. Think of this as **absraction.**
2. Closely related to this is that high level things really shouldn't be involved in low level things. In my example here the entire robot can be changed without touching the opmode. This is **encapsulation** and it only works in conjunction with abstraction.
3. **Inheritance** is sharing either the interface (of how to interact) with something or the items actually sharing a portion of making that happen.
4. Which leads us to a fancy term that means that we can have several **very** different behaviors occur through the same interface and call this **polymorphism.**

### Don't Repeat Yourself (DRY)

This is an important thing to keep in mind - and yet don't be a slave to it. The "easy" thing to do is to copy parts of the code and make very small changes. The problem is that you will have to make some change that will require a change in 1000 places in code. The flip side is that if you repeat the same code 3 times it isn't the end of the world.

The flip is when so much effort is made to not repeat yourself, it can become overly convoluted. The extreme ends up with 50 variations when most of the time you need to change only one thing.

### 5 Principals of Object Oriented Programming

Here we have an acronym which you can freely forget 40% of. SOLID
- Single Responsibility - is a multiple level deal. A class ideally has one reason for existance. A method should handle one conceptual thing. If this doesn't work, then delegate from within. A method needing to do 5 things (it is ok) should then delegate to 5 methods.
- Open/Closed - means that a class can be extended by building on top of it, but generally should only change if it needs new behavior.
- Liskov Substitution - is one to simply forget about at this stage.
- Interface Segregation is keeping interfaces small. The more a given interface deals with the more likely something will be forced to deal with things it doesn't need.
- Dependency Inversion means making levels depend on abstractions and not concrete implimentations. 
