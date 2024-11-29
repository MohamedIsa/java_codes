public class Candidates {
  private String name;
  private int votes;
  private char gender;

  public Candidates(String name, int votes, char gender) {
    this.name = name;
    this.votes = votes;
    this.gender = gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setVotes(int votes) {
    this.votes = votes;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public int getVotes() {
    return votes;
  }

  public char getGender() {
    return gender;
  }
}