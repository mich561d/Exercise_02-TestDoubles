# Exercise 02 - Test Doubles
By Michael Due - 1. Semester software development student. 

## Reflections

### Computer mouse

**Question:** Identify the types of testing you would perform on a computer mouse, to make sure that it is of the highest quality.

**Tests:**
- Speed
- Precision
- Durability
- Battery
- Button press
- Scroll wheel
- Comfortability
- Ergonomic
- Material
- Anti-scratch
- Surface

### Catastrophic failure

**Question:** Find a story where a software system defect had a bad outcome. Describe what happened. Can you identify a test that would have prevented it?

**Short story:** Canada‘s Therac-25 radiation therapy machine malfunctioned and delivered lethal radiation doses to patients.

**Long story:** Canadian Cancer Therapy Machine (Therac-25, 1986) Designed by Atomic Energy of Canada, Ltd. (AECL):Therac-25 was a software controlled radiation therapy machine used to treat people with cancer. Between 1985 and 1987 Therac-25 machines in four medical centers gave massive overdoses of radiation to six patients. An extensive investigation and report revealed that is some instances operators repeated overdoses because machine display indicated no dose given. Some patients received between 13,000-25,000 rads when 100-200 needed. The result of the excessive radiation exposure resulted in severe injuries and three patients‘ deaths.

**Solution:** Testing the software ability to control the current amount of rads while working in multiple environments would have prevented this lethal mistake.

## Two katas

Complete the following using TDD. Remember the TDD mantra.

### String utility

Use TDD to create a string utility with the following methods:

1. Reverse string (aBc -> cBa)
2. Capitalize string (aBc -> ABC)
3. Lowercase string (aBc -> abc)

### Bowling game kata

Complete the Bowling Game Kata using TDD. The slides can be found here: http://butunclebob.com/files/downloads/Bowling%20Game%20Kata.ppt.

## Investigation of tools

### JUnit 5

Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.

**@Tag:** Used to declare tags for filtering tests, either at the class or method level.

**@Disabled:** Used to disable a test class or test method.

**@RepeatedTest:** Denotes that a method is a test template for a repeated test.

**@BeforeEach:** Denotes that the annotated method should be executed before each @Test or @RepeatedTest method in the current class.

**@AfterEach:** Denotes that the annotated method should be executed after each @Test or @RepeatedTest method in the current class.

**@BeforeAll:** Denotes that the annotated method should be executed before all @Test or @RepeatedTest methods in the current class.

**@AfterAll:** Denotes that the annotated method should be executed after all @Test or @RepeatedTest methods in the current class.

**@DisplayName:** Declares a custom display name for the test class or test method.

**@Nested:** Denotes that the annotated class is a non-static nested test class.

**assumeFalse:** Validate the given assumption to be false.

**assumeTrue:** Validate the given assumption to be true.

### Mocking frameworks

Investigate mocking frameworks for your preferred language. Choose at least two frameworks, and answer the questions. (One could be Mockito, which we saw in class.)
1. What are their similarities?
2. What are their differences?
3. Which one would you prefer, if any, and why?