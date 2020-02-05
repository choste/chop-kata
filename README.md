# chop-kata
Kata02: Karate Chop from Dave Thomas.

## Prerequisits
### Maven
Dependencies and test orchestration is done through Maven.

    brew install maven
  
### Java
    brew cask install adoptopenjdk
    
## Specification
The chop method takes an integer target and a sorted array of integers. The method should return the index that matches the target or -1 if the target is not in the array. The implementation should be use a binary search to find the index.

### Goals

1. Have Fun
1. Find not just a solution but as many as possible
1. Disscus errors and techniques

## Running the test
There are several tests to verify that the solution works, these can be run with the following command.
    mvn test

These test verify the following scenarios

|expected|target|array  |
|--------|:----:|:-----:|
|-1      | 3    |[]     |
|0       |1     |[1,3,5]|
|1       |3     |[1,3,5]|
|2       |5     |[1,3,5]|
|-1      |0     |[1,3,5]|
