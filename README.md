# Kotlin Set removeIf and removeAll Bug

This repository demonstrates an unexpected behavior of the `removeIf` and `removeAll` functions when used with `MutableSet` in Kotlin.  The functions seem to only remove the *first* matching element instead of all matching elements. This behavior is inconsistent with the behavior when using Lists.

The `bug.kt` file contains code that reproduces the problem, while `bugSolution.kt` offers a workaround.

## Reproduction Steps

1. Clone this repository.
2. Open `bug.kt` in a Kotlin IDE.
3. Run the code. Observe that `removeIf` and `removeAll` only remove the first element matching the predicate.

## Solution

Refer to `bugSolution.kt` for a potential workaround involving using an iterator.  This demonstrates a more predictable way to remove elements based on the predicate from a Set.