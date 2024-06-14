# Reverse Queue Algorithm in Java

This repository contains an algorithm to reverse a queue.

## Problem

Given an integer `k` and an integer queue, reverse the order of the first `k` elements of the queue, leaving the rest in the same relative order. 
e.g.: [1,2,3,4,5] --> `k` = 4 --> [4,3,2,1,5]

## Solution

1. For the first `k` elements:
   - unqueue the element `x`;
   - reorder `(k-1)` elements;
   - queue element `x`; 
2. For `(n-k)` elements:
   - unqueue;
   - queue
