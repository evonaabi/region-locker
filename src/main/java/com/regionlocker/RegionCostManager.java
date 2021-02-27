package com.regionlocker;

import java.util.HashMap;
import java.util.List;

public class RegionCostManager {
    private HashMap<String, Integer> chunkCosts;

    public void InitCosts()
    {
        chunkCosts = new HashMap<String, Integer>();
        chunkCosts.put("12339", 300);
        chunkCosts.put("12595", 400);
        chunkCosts.put("12851", 500);
        chunkCosts.put("13107", 600);
        chunkCosts.put("12338", 300);
        chunkCosts.put("12594", 400);
        chunkCosts.put("12850", 500);
        chunkCosts.put("13106", 600);
        chunkCosts.put("12337", 300);
        chunkCosts.put("12593", 400);
        chunkCosts.put("12849", 500);
        chunkCosts.put("13105", 600);
        chunkCosts.put("12336", 300);
        chunkCosts.put("12592", 400);
        chunkCosts.put("12848", 500);
        chunkCosts.put("13104", 600);
    }

    public int GetChunkCost(String id)
    {
        if (chunkCosts.containsKey(id))
            return chunkCosts.get(id);
        else
            return 0;
    }

    public int TotalChunkCost(List<String> boughtChunks)
    {
        int sum = 0;
        for (String id : boughtChunks)
        {
            sum += GetChunkCost(id);
        }

        return sum;
    }
}

