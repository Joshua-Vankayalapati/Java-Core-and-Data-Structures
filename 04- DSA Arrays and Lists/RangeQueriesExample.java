package com.example.DSA;

public class RangeQueriesExample {

	    static class SegmentTree {
	        int[] tree;
	        int[] arr;
	        int n;

	        public SegmentTree(int[] arr) {
	            this.arr = arr;
	            n = arr.length;
	            tree = new int[4 * n];
	            build(1, 0, n - 1);
	        }

	        private void build(int node, int left, int right) {
	            if (left == right) {
	                tree[node] = arr[left];
	                return;
	            }

	            int mid = (left + right) / 2;
	            build(2 * node, left, mid);
	            build(2 * node + 1, mid + 1, right);

	            tree[node] = tree[2 * node] + tree[2 * node + 1];
	        }

	        public int query(int left, int right) {
	            return query(1, 0, n - 1, left, right);
	        }

	        private int query(int node, int nodeLeft, int nodeRight, int left, int right) {
	            if (right < nodeLeft || left > nodeRight) {
	                return 0;
	            }
	            if (left <= nodeLeft && right >= nodeRight) {
	                return tree[node];
	            }

	            int mid = (nodeLeft + nodeRight) / 2;
	            int leftSum = query(2 * node, nodeLeft, mid, left, right);
	            int rightSum = query(2 * node + 1, mid + 1, nodeRight, left, right);

	            return leftSum + rightSum;
	        }

	        public void update(int index, int newValue) {
	            update(1, 0, n - 1, index, newValue);
	        }

	        private void update(int node, int nodeLeft, int nodeRight, int index, int newValue) {
	            if (nodeLeft == nodeRight) {
	                arr[index] = newValue;
	                tree[node] = newValue;
	                return;
	            }

	            int mid = (nodeLeft + nodeRight) / 2;
	            if (index <= mid) {
	                update(2 * node, nodeLeft, mid, index, newValue);
	            } else {
	                update(2 * node + 1, mid + 1, nodeRight, index, newValue);
	            }

	            tree[node] = tree[2 * node] + tree[2 * node + 1];
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 5, 7, 9, 11};
	        SegmentTree segTree = new SegmentTree(arr);

	        int left = 2;
	        int right = 5;

	        // Query the sum in the range [2, 5]
	        int sumInRange = segTree.query(left, right);
	        System.out.println("Sum in the range [" + left + ", " + right + "] is: " + sumInRange);

	        // Update an element
	        int indexToChange = 3;
	        int newValue = 8;
	        segTree.update(indexToChange, newValue);

	        // Query the sum again after the update
	        sumInRange = segTree.query(left, right);
	        System.out.println("Sum in the range [" + left + ", " + right + "] after update is: " + sumInRange);
	    }
	}
