#Rotating Number Challenge from Code Wars

So this is my solution to the 'Rotate for a Max' challenge from Code Wars created by g964.

Code wars is great if you are learning to program like me! https://www.codewars.com/

Please see below for some notes on the challenge. 

If we take a number 56789. 'One rotation' will create 67895. 
The most significant digit becomes the least significant digit.

We continue this process but we hold digits constant. 
So for the next rotation we hold the first digit in place and 
go from 67895 -> 68957. 6 is held constant on we 'rotate' 7895 to 
give us 8957. Putting back with the 6 gives us 68957. 

Holding two digits in place 68957 -> 68579.

Holding three digits in place 68579 -> 68597.

If we hold the first four digits we just get the same number as we cannot 
rotate 1 figure. So now we have a sequence of numbers

56789 -> 67895 -> 68957 -> 68579 -> 68597

The challenge is to create the above sequence for any given positive number and 
return the largest number.

My first go at this involves breaking the numbers down into Strings and then Chars
to rearrange. This way I can change the order of figures without being tripped up by 
the presence of 0 in numbers - this makes the maths complicated if you seek to use division 
and modulus operators.

