class complement {
	public static int findComplement(int num) {
        // Find the highest set bit and create a bitmask
        int bitmask = Integer.highestOneBit(num);
        bitmask = (bitmask << 1) - 1; // Create a bitmask of all 1s with the same length

        // XOR the number with the bitmask to get the complement
        return num ^ bitmask;
    }
}