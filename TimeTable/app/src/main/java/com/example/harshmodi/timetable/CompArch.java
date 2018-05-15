package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CompArch extends AppCompatActivity {
    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_arch);

        lv = (ListView)findViewById(R.id.lvCA);
        list.add("Introduction:\n Design objectives of a computer architect; cost and performance\n" +
                "measures; benchmark & metrics; instruction set architecture classification; instruction format and\n" +
                "semantics; memory addressing modes; instruction encoding principles; role of compilers; formal\n" +
                "description of architecture; VHDL; AADL.\n");
        list.add("Instruction level parallelism:\n" +
                "Basic principles of pipelines; structural, control and data hazards; instruction pipelines; branch\n" +
                "prediction; pipeline scheduling and collision avoidance; optimizing pipeline performance; RISC\n" +
                "& CISC pipeline examples. VLIW architecture; overview of proposed and commercial VLIW\n" +
                "Systems.\n");
        list.add("Superscalar architecture; basic objectives of superscalar processing; superscalar instruction\n" +
                "issues; issue policies; instruction pairing rules; shelving; register renaming; load/ store reordering;\n" +
                "the reorder buffer; instruction pipeline – D1, D2 execution and write-back stages; branch\n" +
                "handling – delayed branch, multiway branch; case study – Power PC620, Pentium Pro.\n");
        list.add("Code scheduling for ILP processor; basic block scheduling; loop scheduling; global scheduling.\n");
        list.add("Data parallel architecture: Basic idea of data parallelism; connectivity – nearest neighbour,\n" +
                "tree, pyramid, mesh, hypercube and reconfigurable networks; different classes of data parallel\n" +
                "architecture – SIMD, associative, neural, data parallel pipeline, systolic and vector architectures.\n" +
                "SIMD architecture; features – granularity, connectivity, processor complexity & local autonomy;\n" +
                "fine grained SIMD overview; an example – the Massively Parallel Processor; coarse grained\n" +
                "SIMD overview; an example – the CM5; SIMD algorithm examples – matrix multiplication/\n" +
                "inversion, sorting/ searching.\n" +
                "Systolic architecture; introduction; systolic design space; comparison with multidimensional\n" +
                "pipeline; spatial convolutions; case study – the WARP processor. \n" +
                "Vector architecture; principles of vectorization; pipelined & parallel stream implementation of\n" +
                "vector machine; case study – the CRAY-1, C-90 and the Convex C4/X4 system.\n");
        list.add("4. Thread/ Process level parallelism: Basic architectural concepts; scalable parallel architecture;\n" +
                "design issues for scalable MIMD computers. \n" +
                "Multi-thread implementation on sequential control flow model; case study – the Dencolor HEP\n" +
                "machine, the MIT ‘Sparcle’ machine.\n" +
                "Dataflow architecture; the classical static dataflow machine proposed by J Dennis; tagged token\n" +
                "dataflow machine; explicit token-store architecture; dataflow model verification using simple/\n" +
                "coloured Petri Net. \n" +
                "Shared memory MIMD architecture; systems using single & multiple shared buses; blocking &\n" +
                "non-blocking interconnection networks such as cross-bar and other MINs. \n" +
                "Cache coherence problem; hardware & software coherence policies – write-invalidate, writeupdate,\n" +
                "write-through and write-back policies; snoopy protocol. \n" +
                "Synchronization; spin-lock; event ordering in coherent systems. \n" +
                "Uniform memory access (UMA) machine example; non-uniform memory access (NUMA)\n" +
                "machine example; cache coherent NUMA (CCNUMA) machine example; case study – the SUN\n" +
                "Enterprise 6000.\n");
        list.add("RISC Architecture: comparison between CISC & RISC concepts; RISC machine\n" +
                "features; hardwired control; horizontal machine code format; register file; jumps & delay slots.\n");
        list.add("Special Architecture: Architectural considerations for low power hand held mobile devices,\n" +
                "embedded systems.\n");
        list.add("Parallelization: Parallel program development environment and software tools;\n" +
                "mapping application onto multi-computers.\n");
        list.add("Performance Evaluation: Role of performance; performance metrics; Amdahl’s law;\n" +
                "benchmarks; the SPEC benchmarks; SPEC95 for Pentium & Pentium Pro; SPEC 2000\n" +
                "benchmarks; MIPS as performance metric; native, peak & relative MIPS & FLOPs as\n" +
                "performance measure; synthetic benchmarks; price-performance metric.\n");
        list.add("Suggested Readings:\n" +
                "1. Computer Architecture: A Quantitative Approach by J. L. Hennessy and\n" +
                "D. A. Patterson, 3rd & 4th ed, Elsevier.\n" +
                "2. Advanced Computer Architecture: Parallelism, Scalability, Programmability\n" +
                "by Kai Hwang, TMH.\n" +
                "3. Computer Organization and Design: The Hardware/ Software Interface, by\n" +
                "D. A. Patterson and J. L. Hennessy, 4th ed, Morgan Kaufmann.\n" +
                "4. Advanced Computer Architecture: A Design Space Approach, by D. Sima,\n" +
                "T. Fountain and P. Kacsuk, Pearson Education.\n" +
                "5. Advanced Microprocessors by D. Tabak, McGraw-Hill.\n" +
                "6. The Pentium Microprocessor by J. L. Antonakos, Prentice Hall.\n");

        adapter = new ArrayAdapter(CompArch.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);

    }
}
