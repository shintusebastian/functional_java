## Semantic Versioning
X.X.X

MAJOR.MINOR.PATCH

For Ex: 11.2.201839

Patch: when you find a problem and you want to fix it, and you do not want to 
create a whole release for it. 

pom: pom stands for project object model. 
This is not the actual pom maven is using.  we can see it by right-clicking and selecting Maven, and selecting show effective POM. 
That is the actual pom maven is using for our project. 

##Functional Interfaces

###**Lambdas and Streams are very important from interview perspective. **
See the Test.java class for checking the code in this read file. 


In functional programming, functions are considered as most important. 
Lke OOP treats objects. functional programming can pass a method to a method, return a method from a method, and do whatever with a method. 

Comparator is a generic interface. 

the method List.of gives us immutable objects. We cannot change the order of it.  If we are doing multi threaded programming, go for immutable objects. 
So, List.of method will not work here. 

So, we have to use Arrays.asList() method. 

Another way to do this is using the namesList.sort(String::compareTo). 
Here, we are saying, take this implementation and use it in the sort method. 

OR, we can say. 

names.sort((String first, String second)->first.compareTo(second);

In addition to this, we can implement it using the below method as well. 

namesList.sort(Comparator.naturalOrder());

We can see how the code will look like by going to target folder. then select the Test
class. 

Functional interfaces gives
1. readability
2. Ensures we are not making mistakes. It is a compile-time annotation. By adding the annotation(marker), we declare that it is a functional interface and the compiler will throw error if we are making any mistakes. 
3. It is also a safety measure to prevent anyone else to add another method inside the interface. It can have as many concrete methods, but only one abstract method. 
##Functional Interfaces to read and study
1. Function
2. Bi-function
3. Consumer
4. Bi-Consumer
5. Predicate
6. Comparator
7. Supplier
Java se 9 documentation


When we pass using classname::method name, we call it as method reference. we are giving a refernce to a method. 

##Stream: is the stream of data. 

we can generate a stream of data using the generate method in the Stream interface. 


Stream<String> stream = Stream.generate(() -> "Hello from stream");


stream.forEach(System.out::println);

This will print "Hello from stream" infinitely. 
    
We can terminate the stream using the terminal operations. 
using limit function, we can limit the infinite printing of "Hello from stream".


lombok will help us to write the code for us. 

in the Dish class, we have added @Data and @Builder from the lombok to add
getters & setters and constructor. 

###Explanation of the Runner class
From the dishes, we want to select a vegetarian dish. We can 
do it using the stream() method and use the filter method in the stream method. The filter method inside the stream 
is a predicate. If it returns true, then the element will be allowed to pass. 
if it returns false, then the element will not be allowed to pass. 
We have to write the lambda expression for that. 

We can use more than one filtering on the stream of data. 
To print the filtered elements, select forEach method and select sout. 

We can also collect the filtered items to a list. It is done using 
collect(Collectors.toList()). 
This is actually a sub list of the filtered item.

We can increase the cost of all the non-veg items using the code given below

dishes.stream().filter(d->d.getDishType()==DishType.NON_VEG).map(d->{d.setCost(d.getCost()+2); return d;});

This will increase the cost of all the non-veg items in the list. 

To, find the largest cost in the list, we have used the map method and 
max method. 
*The result that we got is an optional. *

We can segregate the veg and non-veg using the groupingBy method in the 
Collectors class in java. 

Collectors class has many grouping methods. Go through it. 

Sum, min, max, average, and string concatenation are all special cases of reduction. 

###Difference b/w map and flat map
map is a transformer. 
When we use a flat map on a stream, all the elements over there gets flattened or collected over there. That is stream will be terminated. 
Flat map actually starts a new stream from the collected elements.

List<String> ingredients = dishes.stream().

flatMap(d -> d.getIngredients().stream().distinct()).collect(Collectors.toList());//here, we are collecting different
//ingredients from the stream of ingredients.

** Flat map will transform and flattening of the stream and start a new stream of values. **

to remove all the duplicates from a list
use
List.of("Amar","Amar","vivek","manu").stream().distinct().collect(Collectors.toList());

Optional was introduced to avoid the null pointer exception that might occur from somewhere. 
It passes some optional value. It wraps the value and passes a custom exception 
if there is a null value. we can create optional from a null value too. 
