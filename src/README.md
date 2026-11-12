# ModernJavaFeaturesSandbox

A hands-on code sandbox and reference repository documenting the evolution of Java from **Java 8 to Java 25**. Built while progressing through Pragmatic Code School's *Modern Java: Mastering Features from Java 8 to Java 25* course to bridge enterprise Java 8 fundamentals with modern LTS releases.

## Tech Stack & Environment
- **IDE:** IntelliJ IDEA
- **Target JDKs:** Java 17 / Java 21 / Java 25 (LTS & latest language features)
- **Build System:** Standard IntelliJ Java Module

## Package Structure (Chronological + Feature-Separated)

Packages are organized chronologically by JDK release, with sub-packages separating individual language and API features:

```text
src/
└── com/sandbox/
    ├── v8/                     # Functional & Stream Foundations
    │   ├── lambdas/            # Functional interfaces, variable capture, invokedynamic
    │   ├── methodrefs/         # Static, instance, and constructor references
    │   ├── streams/            # Pipelines, collectors, grouping, parallel streams
    │   ├── optional/           # Null-safe fluent APIs
    │   └── datetime/           # java.time (LocalDate, Instant, ZonedDateTime, Duration)
    ├── v9_11/                  # API Polish & Local Type Inference
    │   ├── collections/        # List.of(), Set.of(), Map.of(), copyOf()
    │   ├── var/                # Local-variable type inference (JEP 286)
    │   ├── strings/            # isBlank(), lines(), strip(), repeat()
    │   └── httpclient/         # Standard java.net.http.HttpClient
    ├── v14_17/                 # Data-Oriented Programming & Pattern Matching (LTS)
    │   ├── textblocks/         # Multi-line string literals & formatting
    │   ├── switchexpr/         # Switch expressions & yield
    │   ├── records/            # Immutable data carriers & compact constructors
    │   ├── sealed/             # Sealed classes & interfaces (algebraic data types)
    │   └── instanceofpattern/  # Pattern matching for instanceof
    ├── v21/                    # Modern Concurrency & Advanced Pattern Matching (LTS)
    │   ├── virtualthreads/     # Project Loom lightweight threads & Executors
    │   ├── patternswitch/      # Pattern matching for switch & guarded patterns (when)
    │   ├── recordpatterns/     # Deconstructing records in switch & instanceof
    │   └── sequenced/          # SequencedCollection, SequencedSet, SequencedMap
    └── v22_25/                 # Latest Language & Stream Enhancements
        ├── unnamed/            # Unnamed variables & patterns (_)
        ├── gatherers/          # Custom intermediate stream operations (Stream Gatherers)
        └── scopedvalues/       # Modern alternative to ThreadLocal