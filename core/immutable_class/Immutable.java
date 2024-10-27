package core.immutable_class;

import java.util.ArrayList;
import java.util.List;

final class Immutable {
  /*
    - We can not change the values of an object once it is created.
    - Declare class as 'final' so that is can not be extended.
    - All class members should be private.
    - And class members are initialized only once using constructor.
    - There should not be any setter method.
    - *copy of members should be returned.
    - eg: String, Wrapper classes etc...
  */

  private final String name;
  private final List<Object> petNames;

  Immutable(String name, List<Object> petNames) {
    this.name = name;
    this.petNames = petNames;
  }

  public String getName() {
    return this.name;
  }

  public List<Object> getPetNames() {
    /*
      return this.petNames;
      - this is not allowed because the petNames list should not mutable even outside class.
      - and this is not a deep copy but always point to the address of the same list.
    */

    return new ArrayList<>(petNames);
  }
}
