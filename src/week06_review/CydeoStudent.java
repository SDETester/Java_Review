package week06_review;

public class CydeoStudent {
    public String name;
    public int age;
    public boolean isMarried, isEmployed;
    public char gender;
    public int batchNumber;
    public String programmingLanguage;
    public String groupName;
    //public static String schoolName = "Cydeo";
        public void setInfo(String name, int age, char gender, boolean isMarried, boolean isEmployed, int batchNumber, String programmingLanguage, String groupName) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.isMarried = isMarried;
            this.isEmployed = isEmployed;
            this.batchNumber = batchNumber;
            this.programmingLanguage = programmingLanguage;
            this.groupName = groupName;
        }
        public String toString() {
            return "CydeoStudent{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    ", isMarried=" + isMarried +
                    ", isEmployed=" + isEmployed +
                    ", batchNumber=" + batchNumber +
                    ", programmingLanguage='" + programmingLanguage + '\'' +
                    ", groupName='" + groupName + '\'' +
                    '}';
        }

        public void study(){
            System.out.println(name +" is studying "+programmingLanguage);
        }



    }

/*
In each object, user should be able to store the:
    name, age, gender, isMarried, isEmployed, batch, programming language, and group name information of the Cydeo student
 */

