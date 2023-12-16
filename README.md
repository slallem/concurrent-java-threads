# concurrent-java-threads
Testing concurrent access within a multithreaded environment.

## Use case

Examples relies on an EventLog class, capable of storing simple events (strings).
Different examples show class behaviour while accessing a single instance from different jobs.

## Example 1

Simple sequential jobs execution:
no problems.

## Example 2

Parallelized thread jobs:
Access problem (An item is accessed while just removed by another thread)

## Example 3

Parallelized thread jobs with coarse job-level synchronization (synchronized block) :
Works fine but job are blocking each other and execution time results quite like sequential.

## Example 4

Parallelized thread jobs with fine event-level synchronization (synchronized block) :
Works fine, Jobs fully parallelized, no concurrent access problems.
