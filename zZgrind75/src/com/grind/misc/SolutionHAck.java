package com.grind.misc;
import java.io.*;
import java.util.*;
import java.time.LocalDate;


class User {
    private int id;
    private String identityNumber;
    private String firstName;
    private String lastName;
    private int age;
    private LocalDate birthDate;
    private String email;
    private String gender;
    private String country;
    private String city;
    private String address;
    private String zipCode;
    private String phoneNumber;
    private String department;
    private String roles;
    private LocalDate joinDate;
    private double credit;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public boolean equals(Object obj) {
    	 User other = (User) obj;
			if (other.id != this.id) {
				System.out.println("true1");
			}

			if (!other.identityNumber.equals(this.identityNumber)) {
				System.out.println("true2");
			}

			if (!other.firstName.equals(this.firstName)) {
				System.out.println("true3");
			}

			if (!other.lastName.equals(this.lastName) || other.age != this.age
					|| !other.birthDate.equals(this.birthDate)) {
				System.out.println("true4");
			}

			if (!other.email.equals(this.email) || !other.gender.equals(this.gender)
					|| !other.country.equals(this.country)) {
				System.out.println("true5");
			}

			if (!other.city.equals(this.city) || !other.address.equals(this.address)
					|| !other.zipCode.equals(this.zipCode)) {
				System.out.println("true5");
			}

			if (!other.phoneNumber.equals(this.phoneNumber) || !other.department.equals(this.department)) {
				System.out.println("true6");
			}

			if (!other.roles.equals(this.roles) || !other.joinDate.equals(this.joinDate)
					|| other.credit != this.credit) {
				System.out.println("true7");
			}

			if (!other.status.equals(this.status)) {
				System.out.println("true8");
			}
			if (other.id == this.id && other.identityNumber == this.identityNumber && other.firstName == this.firstName
					&& other.lastName == this.lastName && other.age == this.age && other.birthDate == this.birthDate
					&& other.email == this.email && other.gender == this.gender && other.country == this.country
					&& other.city == this.city && other.address == this.address && other.zipCode == this.zipCode
					&& other.phoneNumber == this.phoneNumber && other.department == this.department
					&& other.roles == this.roles && other.joinDate.equals(this.joinDate) && other.credit == this.credit
					&& other.status == this.status) 
    	 {
    		return true; 
    	 }
    	return false;
    }
}

class UserManager
{
        /*
     * Complete the 'CompareUsers' function below.
     *
     * The function is expected to return two lists which are updated and inserted.
     * The function accepts two lists usersListInDB and newUsersList as parameter.
     */
    public static List<User>[] compareUsers(List<User> usersListInDB, List<User> newUsersList)
    {
    	//List<User>[] lst= null;
    	List<User>[] lst = new List[2];
    	return lst;
    }
}
public class SolutionHAck {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.getenv("OUTPUT_PATH"), "UTF-8");

        List<User> usersListInDB = new ArrayList<>();
        List<User> newUsersList = new ArrayList<>();
        
        int userInDbCount = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < userInDbCount; i++) {
            String[] u = reader.readLine().trim().split(",");
            User usr = new User();
            usr.setId(u[0].isEmpty() ? 0 : Integer.parseInt(u[0]));
            usr.setIdentityNumber(u[1]);
            usr.setFirstName(u[2]);
            usr.setLastName(u[3]);
            usr.setAge(u[4].isEmpty() ? 0 : Integer.parseInt(u[4]));
            usr.setBirthDate(u[5].isEmpty() ? null : LocalDate.of(Integer.parseInt(u[5].split("\\.")[0]), Integer.parseInt(u[5].split("\\.")[1]), Integer.parseInt(u[5].split("\\.")[2])));
            usr.setEmail(u[6]);
            usr.setGender(u[7]);
            usr.setCountry(u[8]);
            usr.setCity(u[9]);
            usr.setAddress(u[10]);
            usr.setZipCode(u[11]);
            usr.setPhoneNumber(u[12]);
            usr.setDepartment(u[13]);
            usr.setRoles(u[14]);
            usr.setJoinDate(u[15].isEmpty() ? null : LocalDate.of(Integer.parseInt(u[15].split("\\.")[0]), Integer.parseInt(u[15].split("\\.")[1]), Integer.parseInt(u[15].split("\\.")[2])));
            usr.setCredit(u[16].isEmpty() ? 0.0 : Double.parseDouble(u[16]));
            usr.setStatus(u[17]);
            usersListInDB.add(usr);
        }
        
        int newUsersCount = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < newUsersCount; i++) {
            String[] u = reader.readLine().trim().split(",");
            User usr = new User();
            usr.setId(u[0].isEmpty() ? 0 : Integer.parseInt(u[0]));
            usr.setIdentityNumber(u[1]);
            usr.setFirstName(u[2]);
            usr.setLastName(u[3]);
            usr.setAge(u[4].isEmpty() ? 0 : Integer.parseInt(u[4]));
            usr.setBirthDate(u[5].isEmpty() ? null : LocalDate.of(Integer.parseInt(u[5].split("\\.")[0]), Integer.parseInt(u[5].split("\\.")[1]), Integer.parseInt(u[5].split("\\.")[2])));
            usr.setEmail(u[6]);
            usr.setGender(u[7]);
            usr.setCountry(u[8]);
            usr.setCity(u[9]);
            usr.setAddress(u[10]);
            usr.setZipCode(u[11]);
            usr.setPhoneNumber(u[12]);
            usr.setDepartment(u[13]);
            usr.setRoles(u[14]);
            usr.setJoinDate(u[15].isEmpty() ? null : LocalDate.of(Integer.parseInt(u[15].split("\\.")[0]), Integer.parseInt(u[15].split("\\.")[1]), Integer.parseInt(u[15].split("\\.")[2])));
            usr.setCredit(u[16].isEmpty() ? 0.0 : Double.parseDouble(u[16]));
            usr.setStatus(u[17]);
            newUsersList.add(usr);
        }
        
        List<User> res[] = UserManager.compareUsers(usersListInDB, newUsersList);
        writer.println("Updated Users:" + res[0].size());
        writer.println("Inserted Users:" + res[1].size());
        writer.flush();
        writer.close();
        
        Queue<String> queue = new ArrayDeque<String>();
        Queue<String> list = new LinkedList<String>();
        
        
        
        
    }
}