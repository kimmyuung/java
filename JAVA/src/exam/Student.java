package exam;

public class Student
{
// 1. field
private String name;
private int kor;
private int eng;
private int math;
private int total = kor + eng + math;
private double avg = (total / 3);

// 2.constructor
public Student () {}

public Student(String name, int kor, int eng, int math)
{
	super();
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
}

public Student(String name, int kor, int eng, int math, int total, double avg)
{
	super();
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	this.total = total;
	this.avg = avg;
}
// 3. method

public String getName()
{
	return name;
}

public void setName(String name)
{
	this.name = name;
}

public int getKor()
{
	return kor;
}

public void setKor(int kor)
{
	this.kor = kor;
}

public int getEng()
{
	return eng;
}

public void setEng(int eng)
{
	this.eng = eng;
}

public int getMath()
{
	return math;
}

public void setMath(int math)
{
	this.math = math;
}

public int getTotal()
{
	return total;
}

public void setTotal(int total)
{
	this.total = total;
}

public double getAvg()
{
	return avg;
}

public void setAvg(double avg)
{
	this.avg = avg;
}

}
