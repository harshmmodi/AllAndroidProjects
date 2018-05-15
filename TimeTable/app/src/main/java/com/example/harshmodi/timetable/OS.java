package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class OS extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os);

        lv = (ListView)findViewById(R.id.lvOS);
        list.add("Introduction to Operating Systems\n");
        list.add("Concept of batch-processing, multi-programming, time sharing, real time\n" +
                "operations\n");
        list.add("Process Management:\n Concept of process, state diagram, process control block;\n" +
                "scheduling of processes – criteria, types of scheduling, non-preemptive and\n" +
                "preemptive scheduling algorithms like: FCFS, Shortest Job First/Next (SJF/N),\n" +
                "Shortest Remaining Time Next (SRTN), Round Robin (RR), Highest Response\n" +
                "ratio Next (HRN), Priority based scheduling, different Multilevel queue\n" +
                "scheduling etc.;\n");
        list.add("Threads:\n concept, process vs thread, kernel and user threads, multithreading\n" +
                "models\n");
        list.add("Inter-process Communication (IPC):\n Shared memory, message, FIFO, concept of\n" +
                "semaphore, critical region, monitor\n");
        list.add("Process Synchronization:\n concepts, race condition, critical section problem and its\n" +
                "solutions; synchronization tools- semaphore, monitor etc., discussion of\n" +
                "synchronization problems like producer-consumer, readers-writers, dining\n" +
                "philosophers, sleeping-barber etc.\n" +
                "Deadlock – conditions, resource allocation graph, prevention techniques,\n" +
                "avoidance technique – Banker’s algorithm and related algorithms\n");
        list.add("Memory management:\n Address space and address translation;\n" +
                "static partitioning, dynamic partitioning, different types of fragmentation, paging,\n" +
                "segmentation, swapping, virtual memory, demand paging, page size, page table,\n" +
                "page replacement algorithms – FIFO, LRU, Optimal page replacement, Variants\n" +
                "of LRU, etc; thrashing, working set strategy\n");
        list.add("File Management:\n File and operations on it, file organization and access; file\n" +
                "allocation; directory structures, file sharing, file protection\n");
        list.add("Device management:\n Magnetic disks,\n" +
                "disk scheduling- criteria, algorithms – FCFS, SSTF, SCAN, C-SCAN, LOOK,\n" +
                "etc, disk management – formatting, boot block, disk free space management\n" +
                "techniques, concept of RAID etc");
        list.add("Protection and Security:\n Concepts of domain, Access matrix and its\n" +
                "implementation, access control, Security of systems- concepts, threats- Trojan\n" +
                "horse, virus, worms etc, introduction to cryptography as security tool, user\n" +
                "authentication\n");
        list.add("Case Studies\n");
        list.add("Suggested Readings:\n 1. Operating Systems Concepts – A. Silberschatz, P. Galvin and G. Gagne. Wiley India\n" +
                "2. Operating Systems Concepts - Gary Nutt, N. Chaki and S. Neogy, Pearson\n" +
                "Education\n" +
                "3. Operating Systems – W. Stallings, Pearson Education\n" +
                "4. Operating Systems: A Concept-based Approach – D. M. Dhamdhere, Tata\n" +
                "McGraw-Hill\n");
        adapter = new ArrayAdapter(OS.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
