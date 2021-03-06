package examPlanner;

import java.util.ArrayList;

public class Exam implements BinarySave{
  private MyDate date;
  private ArrayList<Person> participants;

  private Room room;
  private String subject;
  private String teacher;
  private String type;
  private String format;
  private String ects;
  private String examiners;

  public Exam(MyDate date, String subject, Room room, String teacher,
      String type, String format, String ects, String examiners)
  {
    this.date = date;
    this.subject = subject;
    this.room = room;
    this.teacher = teacher;
    this.type = type;
    this.format = format;
    this.ects = ects;
    this.examiners = examiners;
  }

  public Room getRoom()
  {
    return room;
  }

  @Override public String toString()
  {
    return String.format("%s, %s, %s, %s, %s, %s ,%s ,%s", subject, room.toString(),
        getDate().toString(), teacher, type, format, ects, examiners);
  }

  public MyDate getDate()
  {
    return date;
  }

  public void setRoom(Room room)
  {
    this.room = room;
  }

  public String getSubject()
  {
    return subject;
  }

  public void setSubject(String subject)
  {
    this.subject = subject;
  }

  public String getTeacher()
  {
    return teacher;
  }

  public void setTeacher(String teacher)
  {
    this.teacher = teacher;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public String getFormat()
  {
    return format;
  }

  public void setFormat(String format)
  {
    this.format = format;
  }

  public String getEcts()
  {
    return ects;
  }

  public void setEcts(String ects)
  {
    this.ects = ects;
  }

  public String getExaminers()
  {
    return examiners;
  }

  public void setExaminers(String examiners)
  {
    this.examiners = examiners;
  }
}