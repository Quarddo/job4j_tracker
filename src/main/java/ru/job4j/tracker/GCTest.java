package ru.job4j.tracker;

public class GCTest {

    public static void main(String[] args) {
        MemTracker memTracker = new MemTracker();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            memTracker.add(new Item("Item" + i));
        }
        System.out.printf("Время работы %d", System.currentTimeMillis() - start);
    }
}
/**
 * [0.011s][info][gc] Using Serial
 * [0.012s][info][gc,init] Version: 17.0.1+12-LTS-39 (release)
 * [0.012s][info][gc,init] CPUs: 8 total, 8 available
 * [0.012s][info][gc,init] Memory: 8192M
 * [0.012s][info][gc,init] Large Page Support: Disabled
 * [0.012s][info][gc,init] NUMA Support: Disabled
 * [0.012s][info][gc,init] Compressed Oops: Enabled (Zero based)
 * [0.012s][info][gc,init] Heap Min Capacity: 8M
 * [0.012s][info][gc,init] Heap Initial Capacity: 128M
 * [0.012s][info][gc,init] Heap Max Capacity: 2G
 * [0.012s][info][gc,init] Pre-touch: Disabled
 * [0.012s][info][gc,metaspace] CDS archive(s) mapped at: [0x0000000800000000-0x0000000800bd4000-0x0000000800bd4000), size 12402688, SharedBaseAddress: 0x0000000800000000, ArchiveRelocationMode: 0.
 * [0.012s][info][gc,metaspace] Compressed class space mapped at: 0x0000000800c00000-0x0000000840c00000, reserved size: 1073741824
 * [0.012s][info][gc,metaspace] Narrow klass base: 0x0000000800000000, Narrow klass shift: 0, Narrow klass range: 0x100000000
 * ____
 * Время работы 167[0.384s][info][gc,heap,exit] Heap
 * ____
 * [0.384s][info][gc,heap,exit]  def new generation   total 39296K, used 29156K [0x0000000780000000, 0x0000000782aa0000, 0x00000007aaaa0000)
 * [0.384s][info][gc,heap,exit]   eden space 34944K,  83% used [0x0000000780000000, 0x0000000781c79008, 0x0000000782220000)
 * [0.384s][info][gc,heap,exit]   from space 4352K,   0% used [0x0000000782220000, 0x0000000782220000, 0x0000000782660000)
 * [0.384s][info][gc,heap,exit]   to   space 4352K,   0% used [0x0000000782660000, 0x0000000782660000, 0x0000000782aa0000)
 * [0.384s][info][gc,heap,exit]  tenured generation   total 87424K, used 0K [0x00000007aaaa0000, 0x00000007b0000000, 0x0000000800000000)
 * [0.384s][info][gc,heap,exit]    the space 87424K,   0% used [0x00000007aaaa0000, 0x00000007aaaa0000, 0x00000007aaaa0200, 0x00000007b0000000)
 * [0.384s][info][gc,heap,exit]  Metaspace       used 1003K, committed 1216K, reserved 1056768K
 * [0.384s][info][gc,heap,exit]   class space    used 88K, committed 192K, reserved 1048576K
 * _______________
 *[0.011s][info][gc] Using Parallel
 * [0.012s][info][gc,init] Version: 17.0.1+12-LTS-39 (release)
 * [0.012s][info][gc,init] CPUs: 8 total, 8 available
 * [0.012s][info][gc,init] Memory: 8192M
 * [0.012s][info][gc,init] Large Page Support: Disabled
 * [0.012s][info][gc,init] NUMA Support: Disabled
 * [0.012s][info][gc,init] Compressed Oops: Enabled (Zero based)
 * [0.012s][info][gc,init] Alignments: Space 512K, Generation 512K, Heap 2M
 * [0.012s][info][gc,init] Heap Min Capacity: 8M
 * [0.012s][info][gc,init] Heap Initial Capacity: 128M
 * [0.012s][info][gc,init] Heap Max Capacity: 2G
 * [0.012s][info][gc,init] Pre-touch: Disabled
 * [0.012s][info][gc,init] Parallel Workers: 8
 * [0.012s][info][gc,metaspace] CDS archive(s) mapped at: [0x0000000800000000-0x0000000800bd4000-0x0000000800bd4000), size 12402688, SharedBaseAddress: 0x0000000800000000, ArchiveRelocationMode: 0.
 * [0.012s][info][gc,metaspace] Compressed class space mapped at: 0x0000000800c00000-0x0000000840c00000, reserved size: 1073741824
 * [0.012s][info][gc,metaspace] Narrow klass base: 0x0000000800000000, Narrow klass shift: 0, Narrow klass range: 0x100000000
 * ____
 * Время работы 204[0.418s][info][gc,heap,exit] Heap
 * ____
 * [0.418s][info][gc,heap,exit]  PSYoungGen      total 38400K, used 30619K [0x00000007d5580000, 0x00000007d8000000, 0x0000000800000000)
 * [0.419s][info][gc,heap,exit]   eden space 33280K, 92% used [0x00000007d5580000,0x00000007d7366c48,0x00000007d7600000)
 * [0.419s][info][gc,heap,exit]   from space 5120K, 0% used [0x00000007d7b00000,0x00000007d7b00000,0x00000007d8000000)
 * [0.419s][info][gc,heap,exit]   to   space 5120K, 0% used [0x00000007d7600000,0x00000007d7600000,0x00000007d7b00000)
 * [0.419s][info][gc,heap,exit]  ParOldGen       total 87552K, used 0K [0x0000000780000000, 0x0000000785580000, 0x00000007d5580000)
 * [0.419s][info][gc,heap,exit]   object space 87552K, 0% used [0x0000000780000000,0x0000000780000000,0x0000000785580000)
 * [0.419s][info][gc,heap,exit]  Metaspace       used 1000K, committed 1216K, reserved 1056768K
 * [0.419s][info][gc,heap,exit]   class space    used 88K, committed 192K, reserved 1048576K
 * _______________
 * [0.011s][info][gc] Using G1
 * [0.012s][info][gc,init] Version: 17.0.1+12-LTS-39 (release)
 * [0.013s][info][gc,init] CPUs: 8 total, 8 available
 * [0.013s][info][gc,init] Memory: 8192M
 * [0.013s][info][gc,init] Large Page Support: Disabled
 * [0.013s][info][gc,init] NUMA Support: Disabled
 * [0.013s][info][gc,init] Compressed Oops: Enabled (Zero based)
 * [0.013s][info][gc,init] Heap Region Size: 1M
 * [0.013s][info][gc,init] Heap Min Capacity: 8M
 * [0.013s][info][gc,init] Heap Initial Capacity: 128M
 * [0.013s][info][gc,init] Heap Max Capacity: 2G
 * [0.013s][info][gc,init] Pre-touch: Disabled
 * [0.013s][info][gc,init] Parallel Workers: 8
 * [0.013s][info][gc,init] Concurrent Workers: 2
 * [0.013s][info][gc,init] Concurrent Refinement Workers: 8
 * [0.013s][info][gc,init] Periodic GC: Disabled
 * [0.013s][info][gc,metaspace] CDS archive(s) mapped at: [0x0000000800000000-0x0000000800bd4000-0x0000000800bd4000), size 12402688, SharedBaseAddress: 0x0000000800000000, ArchiveRelocationMode: 0.
 * [0.013s][info][gc,metaspace] Compressed class space mapped at: 0x0000000800c00000-0x0000000840c00000, reserved size: 1073741824
 * [0.013s][info][gc,metaspace] Narrow klass base: 0x0000000800000000, Narrow klass shift: 0, Narrow klass range: 0x100000000
 * [0.388s][info][gc,start    ] GC(0) Pause Young (Normal) (G1 Evacuation Pause)
 * [0.389s][info][gc,task     ] GC(0) Using 3 workers of 8 for evacuation
 * [0.408s][info][gc,phases   ] GC(0)   Pre Evacuate Collection Set: 0.5ms
 * [0.408s][info][gc,phases   ] GC(0)   Merge Heap Roots: 0.1ms
 * [0.408s][info][gc,phases   ] GC(0)   Evacuate Collection Set: 17.1ms
 * [0.408s][info][gc,phases   ] GC(0)   Post Evacuate Collection Set: 1.2ms
 * [0.408s][info][gc,phases   ] GC(0)   Other: 1.4ms
 * [0.408s][info][gc,heap     ] GC(0) Eden regions: 23->0(14)
 * [0.408s][info][gc,heap     ] GC(0) Survivor regions: 0->3(3)
 * [0.408s][info][gc,heap     ] GC(0) Old regions: 0->11
 * [0.408s][info][gc,heap     ] GC(0) Archive regions: 2->2
 * [0.408s][info][gc,heap     ] GC(0) Humongous regions: 0->0
 * [0.409s][info][gc,metaspace] GC(0) Metaspace: 904K(1088K)->904K(1088K) NonClass: 825K(896K)->825K(896K) Class: 78K(192K)->78K(192K)
 * [0.409s][info][gc          ] GC(0) Pause Young (Normal) (G1 Evacuation Pause) 23M->14M(130M) 20.303ms
 * [0.409s][info][gc,cpu      ] GC(0) User=0.02s Sys=0.01s Real=0.02s
 * ____
 * Время работы 212[0.450s][info][gc,heap,exit] Heap
 * ____
 * [0.450s][info][gc,heap,exit]  garbage-first heap   total 133120K, used 19499K [0x0000000780000000, 0x0000000800000000)
 * [0.450s][info][gc,heap,exit]   region size 1024K, 9 young (9216K), 3 survivors (3072K)
 * [0.450s][info][gc,heap,exit]  Metaspace       used 1000K, committed 1216K, reserved 1056768K
 * [0.450s][info][gc,heap,exit]   class space    used 88K, committed 192K, reserved 1048576K
 * _____________
 * [0.012s][info][gc,init] Initializing The Z Garbage Collector
 * [0.012s][info][gc,init] Version: 17.0.1+12-LTS-39 (release)
 * [0.012s][info][gc,init] NUMA Support: Disabled
 * [0.012s][info][gc,init] CPUs: 8 total, 8 available
 * [0.012s][info][gc,init] Memory: 8192M
 * [0.012s][info][gc,init] Large Page Support: Disabled
 * [0.012s][info][gc,init] GC Workers: 2 (dynamic)
 * [0.013s][info][gc,init] Address Space Type: Contiguous/Unrestricted/Complete
 * [0.013s][info][gc,init] Address Space Size: 32768M x 3 = 98304M
 * [0.013s][info][gc,init] Min Capacity: 8M
 * [0.013s][info][gc,init] Initial Capacity: 128M
 * [0.013s][info][gc,init] Max Capacity: 2048M
 * [0.013s][info][gc,init] Medium Page Size: 32M
 * [0.013s][info][gc,init] Pre-touch: Disabled
 * [0.013s][info][gc,init] Uncommit: Enabled
 * [0.013s][info][gc,init] Uncommit Delay: 300s
 * [0.016s][info][gc,init] Runtime Workers: 5
 * [0.016s][info][gc     ] Using The Z Garbage Collector
 * [0.017s][info][gc,metaspace] CDS archive(s) mapped at: [0x0000000800000000-0x0000000800bac000-0x0000000800bac000), size 12238848, SharedBaseAddress: 0x0000000800000000, ArchiveRelocationMode: 0.
 * [0.017s][info][gc,metaspace] Compressed class space mapped at: 0x0000000800c00000-0x0000000840c00000, reserved size: 1073741824
 * [0.017s][info][gc,metaspace] Narrow klass base: 0x0000000800000000, Narrow klass shift: 0, Narrow klass range: 0x100000000
 * ____
 * Время работы 192[0.473s][info][gc,heap,exit] Heap
 * ____
 * [0.473s][info][gc,heap,exit]  ZHeap           used 66M, capacity 128M, max capacity 2048M
 * [0.473s][info][gc,heap,exit]  Metaspace       used 1004K, committed 1216K, reserved 1056768K
 * [0.473s][info][gc,heap,exit]   class space    used 89K, committed 192K, reserved 1048576K
 *
 *
 * 2. Исходя из результатов, для приложения job4j_tracker наиболее оптимальным сборщиком мусора
 * будет Using Serial, показав наименьшее время выполнения работы. Так же данное приложение не нуждается в наличии
 * большого объема памяти и быстрого отклика.
 *
 * 3. Для серверного приложения на мой взгляд оптимальным сборщиком будет G1.
 * Garbage-First (G1) – сборщик мусора серверного типа для многопроцессорных машин с большим объемом памяти.
 * Куча (Heap) разделяется на области фиксированного размера и G1 отслеживает живые данные в этих областях.
 * Когда необходима сборка мусора, gc начинает с областей с меньшим количеством живых данных.
 * G1 сфокусирован на приложениях, которым нужен большой объем кучи с ограниченными задержками при сборке мусора.
 */