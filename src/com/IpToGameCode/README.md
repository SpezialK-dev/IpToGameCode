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

##### Usefull resources 

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Inet4Address.html
https://docs.oracle.com/javase/1.5.0/docs/api/java/net/InetAddress.html#getByName%28java.lang.String%29 //usefull list of methods and stuff like that