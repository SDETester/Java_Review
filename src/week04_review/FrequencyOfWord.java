package week04_review;

public class FrequencyOfWord {

    public static void main(String[] args) {
//                          abc  abc abc  abc
        String sentence = "Java Java Java Java Python C# Ruby C++ Swift";

        int originalLength = sentence.length();

        String temp = sentence.replace("Java", "abc");

        int newLength = temp.length();
        System.out.println(sentence);
        System.out.println(temp);

        System.out.println(originalLength);
        System.out.println(newLength);

        int frequencyOfJava = originalLength - newLength;

        System.out.println("frequencyOfJava = " + frequencyOfJava);


        System.out.println("-----------------------------------------------------------");


        String s = "Python is dynamically-typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly procedural), object-oriented and functional programming. It is often described as a \"batteries included\" language due to its comprehensive standard library.[34][35]\n" +
                "\n" +
                "Guido van Rossum began working on Python in the late 1980s as a successor to the ABC programming language and first released it in 1991 as Python 0.9.0.[36] Python 2.0 was released in 2000 and introduced new features such as list comprehensions, cycle-detecting garbage collection, reference counting, and Unicode support. Python 3.0, released in 2008, was a major revision that is not completely backward-compatible with earlier versions. Python 2 was discontinued with version 2.7.18 in 2020.[37]";


        String t = s.replace("Python", "abcdefg");

        int frequencyOfPython =   t.length() - s.length();

        System.out.println("frequencyOfPython = " + frequencyOfPython);










    }


}

/*
1. Write a program that can return the frequency of the word "Java" from a sentence
				Ex:
					sentence = "Java Java Java Java Python C# Ruby C++ Swift"
					output: 4
			DO NOT implement any new topics (Loops, custom methods etc)
 */
