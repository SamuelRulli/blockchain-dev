package com.cygnus;

import java.util.ArrayList;

public class Blockchain {
    private ArrayList<Block> blocks = new ArrayList<Block>();

    public Blockchain() {
        Block genesisBlock = new Block(0, System.currentTimeMillis(), "Genesis Block", "");
        blocks.add(genesisBlock);
    }

    public void addBlock(String data) {
        Block previousBlock = blocks.get(blocks.size() - 1);

        int newIndex = previousBlock.getIndex() + 1;
        String previousHash = previousBlock.getHash();

        System.out.println("previousHash>>>>>>" + previousHash);

        Block newBlock = new Block(newIndex, System.currentTimeMillis(), data, previousHash);
        blocks.add(newBlock);
    }

    public boolean isChainValid() {
        for (int i = 1; i < blocks.size(); i++) {
            Block currentBlock = blocks.get(i);
            Block previousBlock = blocks.get(i - 1);
            if (!currentBlock.getPreviousHash().equals(previousBlock.getHash())) {
                return false;
            }
        }
        return true;
    }
}
