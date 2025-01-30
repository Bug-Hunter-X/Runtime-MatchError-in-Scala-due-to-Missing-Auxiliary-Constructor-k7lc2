# Scala Runtime MatchError: Missing Auxiliary Constructor

This repository demonstrates a common Scala error: a `MatchError` occurring at runtime when a class with parameters in the primary constructor lacks an auxiliary constructor.  The absence of an auxiliary constructor leads to an inability to create an instance without explicitly providing argument values.

The `Bug.scala` file shows the error, while `BugSolution.scala` provides the solution.

## How to Reproduce

1. Clone this repository.
2. Compile and run `Bug.scala` - you'll observe a `MatchError`. 
3. Compile and run `BugSolution.scala` to see the corrected code.

## Solution

Always provide a default constructor (auxiliary constructor) if your class requires parameter(s) but you want the option to create instances without specifying all parameters. This avoids unexpected runtime issues.