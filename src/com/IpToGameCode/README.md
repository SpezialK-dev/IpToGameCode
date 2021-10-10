# The Idea behind this projekt 

for a school projekt I needed to turn ips into gamecodes so that they could be used instead of just writing the Ip and so I thought well lets see what Ideas I can come up with.
This was only done for Ipv4 Addresses because Ipv6 addresses aren't as whildy adoped for it to make sense and they have to much information so that I cannot compress them into a String of 6 - 8 chars.
Or at Least I dont have an Idea how to do that right now.

### What I need to archive

I need to turn 4 numbers each ranging from 0 to 255 into letters and numbers that are fewer than a normal Ip address

### Possible solutions 

##### Solution 1
the letters represent incremetns of 10 that means that A = 10 , B = 20 and so on. 
numbers just represent their normal value
this would give me the exapt same resoult as using hexadecimal numbers but my version could be improved because I have more letters than needed to compleat the task so I can probaly do some trickery to make it shorter


####what needs to happen in this solution 

to see if a number ends on a 0 divide by 10 and see if this leaves you with a number that is also devidable and that does not have any numbers after the , 
if it does then subtrackt a number and repeat until you have the number of 10s that the class has and you have the number behind that .
the amount of 10s then will corospond to a letter and the numbers will be just normanl added to that. this is how you should get the rigth amount.

#### things I will do to speed up this process

first I will roughtly charigorize the float valou so that It has less to iterate through and it has less code to check.
maybe in valous of 5 like the thinks of 0-5, 6-10, 11-15, 16-20, 21-25. This should cover everything


##### Usefull resources 

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Inet4Address.html
https://docs.oracle.com/javase/1.5.0/docs/api/java/net/InetAddress.html#getByName%28java.lang.String%29 //usefull list of methods and stuff like that