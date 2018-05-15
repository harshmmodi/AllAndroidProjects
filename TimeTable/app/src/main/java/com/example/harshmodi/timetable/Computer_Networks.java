package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Computer_Networks extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer__networks);

        lv = (ListView)findViewById(R.id.lvCN);
        list.add("Introduction: Uses of Computer Networks, Types of Computer Networks, OSI Reference\n" +
                "Model, TCP/IP model\n");
        list.add("Review of Physical Layer\n");
        list.add("Data Link Control and Protocols: Link Layer Services, Error detection and Correction\n" +
                "Techniques, Multi Access Protocols, Link Layer Addressing, Ethernet, Hubs, Switches and\n" +
                "Switches, Point to Point Protocol, Asynchronous Transfer Mode, Multiprotocol Label Switching\n");
        list.add("Network Layer: Introduction, Virtual Circuit and Datagram Networks, IP Addressing,\n" +
                "Subnetting, Routing Algorithms (Link State, Distance Vector, Hierarchical), Routing in the\n" +
                "Internet (RIP, OSPF, BGP), Broadcast and Multicast Routing Algorithms, Routers, ICMP, IPv6\n");
        list.add("Transport Layer: Introduction to Transport Layer Services, Multiplexing and Demultiplexing,\n" +
                "Connectionless Transport: UDP, Principles of Reliable Data Transfer, Connection Oriented\n" +
                "Transport: TCP, Principles of Congestion Control, TCP Congestion Control, Sockets and Socket\n" +
                "Programming, Quality of services (QOS)\n");
        list.add("Application Layer: Web and HTTP, Domain Name Space (DNS), Electronic Mail (SMTP,\n" +
                "MIME, IMAP, POP3), File Transfer Protocol, Cryptography\n");
        list.add("Introduction to Wireless and Mobile Networks\n");
        list.add("Suggested Readings:\n" +
                "1. Computer Networking: A Top-Down Approach Featuring the Internet, by James F.\n" +
                "Kurose and Keith W. Ross, 5th Edition, Pearson Education, 2010\n" +
                "2. Data communication and Networking, by Behrouz A. Forouzan, 4th Edition, Tata\n" +
                "McGraw-Hill, 2007\n" +
                "3. Computer Networks, by Andrew S. Tanenbaum, 4th Edition, Prentice Hall India,\n" +
                "2003\n" +
                "4. Computer Networks: A Systems Approach, by Larry L. Peterson and Peter S.\n" +
                "Davie,4th Edition, Morgan Kauffman Publishers, 2007\n" +
                "5. Data and Computer Communication, by William Stallings, 9th Edition, Pearson\n" +
                "Education, 2011\n" +
                "6. Unix Network Programming: Networking APIs: Sockets and XTI, (Volume 1) by W.\n" +
                "Richard Stevens, 2nd Edition, Prentice Hall India, 1999\n");
        adapter = new ArrayAdapter(Computer_Networks.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}