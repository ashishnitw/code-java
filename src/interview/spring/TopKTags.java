package interview.spring;

import java.util.*;

public class TopKTags {

    static class FileObj {
        String name;
        String tag;
        public FileObj(String name, String tag) {
            this.name = name;
            this.tag = tag;
        }
    }

    private static List<String> getTopKTags(List<FileObj> files, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (FileObj file : files) {
            map.put(file.tag, map.getOrDefault(file.tag, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(k, (a, b) -> b.getValue() - a.getValue());   // max heap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.offer(entry);
        }
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < k && !pq.isEmpty()) {
            String key = pq.poll().getKey();
            res.add(key);
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        List<FileObj> files = Arrays.asList(
                new FileObj("file1", "tag1"),
                new FileObj("file2", "tag2"),
                new FileObj("file3", "tag1"),
                new FileObj("file4", "tag3"),
                new FileObj("file5", "tag2"),
                new FileObj("file6", "tag1"),
                new FileObj("file7", "tag4"),
                new FileObj("file8", "tag2"),
                new FileObj("file9", "tag1"),
                new FileObj("file10", "tag3")
        );

        System.out.println(getTopKTags(files, 2)); // [tag1, tag3]
        System.out.println(getTopKTags(files, 3)); // [tag1, tag3, tag2]
        System.out.println(getTopKTags(files, 1)); // [tag1]
    }
}
