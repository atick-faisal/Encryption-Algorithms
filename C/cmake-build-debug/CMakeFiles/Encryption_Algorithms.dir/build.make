# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.17

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /snap/clion/139/bin/cmake/linux/bin/cmake

# The command to remove a file.
RM = /snap/clion/139/bin/cmake/linux/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/andromeda/Embedded/Encryption-Algorithms/C

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/Encryption_Algorithms.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Encryption_Algorithms.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Encryption_Algorithms.dir/flags.make

CMakeFiles/Encryption_Algorithms.dir/main.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/main.c.o: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/Encryption_Algorithms.dir/main.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/main.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/main.c

CMakeFiles/Encryption_Algorithms.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/main.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/main.c > CMakeFiles/Encryption_Algorithms.dir/main.c.i

CMakeFiles/Encryption_Algorithms.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/main.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/main.c -o CMakeFiles/Encryption_Algorithms.dir/main.c.s

CMakeFiles/Encryption_Algorithms.dir/substitution/caesar.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/substitution/caesar.c.o: ../substitution/caesar.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building C object CMakeFiles/Encryption_Algorithms.dir/substitution/caesar.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/substitution/caesar.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/substitution/caesar.c

CMakeFiles/Encryption_Algorithms.dir/substitution/caesar.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/substitution/caesar.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/substitution/caesar.c > CMakeFiles/Encryption_Algorithms.dir/substitution/caesar.c.i

CMakeFiles/Encryption_Algorithms.dir/substitution/caesar.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/substitution/caesar.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/substitution/caesar.c -o CMakeFiles/Encryption_Algorithms.dir/substitution/caesar.c.s

CMakeFiles/Encryption_Algorithms.dir/substitution/monoalphabetic.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/substitution/monoalphabetic.c.o: ../substitution/monoalphabetic.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Building C object CMakeFiles/Encryption_Algorithms.dir/substitution/monoalphabetic.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/substitution/monoalphabetic.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/substitution/monoalphabetic.c

CMakeFiles/Encryption_Algorithms.dir/substitution/monoalphabetic.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/substitution/monoalphabetic.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/substitution/monoalphabetic.c > CMakeFiles/Encryption_Algorithms.dir/substitution/monoalphabetic.c.i

CMakeFiles/Encryption_Algorithms.dir/substitution/monoalphabetic.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/substitution/monoalphabetic.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/substitution/monoalphabetic.c -o CMakeFiles/Encryption_Algorithms.dir/substitution/monoalphabetic.c.s

CMakeFiles/Encryption_Algorithms.dir/substitution/vignere.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/substitution/vignere.c.o: ../substitution/vignere.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Building C object CMakeFiles/Encryption_Algorithms.dir/substitution/vignere.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/substitution/vignere.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/substitution/vignere.c

CMakeFiles/Encryption_Algorithms.dir/substitution/vignere.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/substitution/vignere.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/substitution/vignere.c > CMakeFiles/Encryption_Algorithms.dir/substitution/vignere.c.i

CMakeFiles/Encryption_Algorithms.dir/substitution/vignere.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/substitution/vignere.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/substitution/vignere.c -o CMakeFiles/Encryption_Algorithms.dir/substitution/vignere.c.s

CMakeFiles/Encryption_Algorithms.dir/substitution/autokey.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/substitution/autokey.c.o: ../substitution/autokey.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_5) "Building C object CMakeFiles/Encryption_Algorithms.dir/substitution/autokey.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/substitution/autokey.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/substitution/autokey.c

CMakeFiles/Encryption_Algorithms.dir/substitution/autokey.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/substitution/autokey.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/substitution/autokey.c > CMakeFiles/Encryption_Algorithms.dir/substitution/autokey.c.i

CMakeFiles/Encryption_Algorithms.dir/substitution/autokey.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/substitution/autokey.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/substitution/autokey.c -o CMakeFiles/Encryption_Algorithms.dir/substitution/autokey.c.s

CMakeFiles/Encryption_Algorithms.dir/transposition/railfence.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/transposition/railfence.c.o: ../transposition/railfence.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_6) "Building C object CMakeFiles/Encryption_Algorithms.dir/transposition/railfence.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/transposition/railfence.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/transposition/railfence.c

CMakeFiles/Encryption_Algorithms.dir/transposition/railfence.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/transposition/railfence.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/transposition/railfence.c > CMakeFiles/Encryption_Algorithms.dir/transposition/railfence.c.i

CMakeFiles/Encryption_Algorithms.dir/transposition/railfence.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/transposition/railfence.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/transposition/railfence.c -o CMakeFiles/Encryption_Algorithms.dir/transposition/railfence.c.s

CMakeFiles/Encryption_Algorithms.dir/transposition/rowtransposition.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/transposition/rowtransposition.c.o: ../transposition/rowtransposition.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_7) "Building C object CMakeFiles/Encryption_Algorithms.dir/transposition/rowtransposition.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/transposition/rowtransposition.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/transposition/rowtransposition.c

CMakeFiles/Encryption_Algorithms.dir/transposition/rowtransposition.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/transposition/rowtransposition.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/transposition/rowtransposition.c > CMakeFiles/Encryption_Algorithms.dir/transposition/rowtransposition.c.i

CMakeFiles/Encryption_Algorithms.dir/transposition/rowtransposition.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/transposition/rowtransposition.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/transposition/rowtransposition.c -o CMakeFiles/Encryption_Algorithms.dir/transposition/rowtransposition.c.s

CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_util.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_util.c.o: ../sdes/sdes_util.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_8) "Building C object CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_util.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_util.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/sdes/sdes_util.c

CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_util.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_util.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/sdes/sdes_util.c > CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_util.c.i

CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_util.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_util.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/sdes/sdes_util.c -o CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_util.c.s

CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_feistel.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_feistel.c.o: ../sdes/sdes_feistel.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_9) "Building C object CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_feistel.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_feistel.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/sdes/sdes_feistel.c

CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_feistel.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_feistel.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/sdes/sdes_feistel.c > CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_feistel.c.i

CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_feistel.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_feistel.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/sdes/sdes_feistel.c -o CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_feistel.c.s

CMakeFiles/Encryption_Algorithms.dir/sdes/sdes.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/sdes/sdes.c.o: ../sdes/sdes.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_10) "Building C object CMakeFiles/Encryption_Algorithms.dir/sdes/sdes.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/sdes/sdes.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/sdes/sdes.c

CMakeFiles/Encryption_Algorithms.dir/sdes/sdes.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/sdes/sdes.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/sdes/sdes.c > CMakeFiles/Encryption_Algorithms.dir/sdes/sdes.c.i

CMakeFiles/Encryption_Algorithms.dir/sdes/sdes.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/sdes/sdes.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/sdes/sdes.c -o CMakeFiles/Encryption_Algorithms.dir/sdes/sdes.c.s

CMakeFiles/Encryption_Algorithms.dir/sdes/subkey.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/sdes/subkey.c.o: ../sdes/subkey.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_11) "Building C object CMakeFiles/Encryption_Algorithms.dir/sdes/subkey.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/sdes/subkey.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/sdes/subkey.c

CMakeFiles/Encryption_Algorithms.dir/sdes/subkey.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/sdes/subkey.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/sdes/subkey.c > CMakeFiles/Encryption_Algorithms.dir/sdes/subkey.c.i

CMakeFiles/Encryption_Algorithms.dir/sdes/subkey.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/sdes/subkey.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/sdes/subkey.c -o CMakeFiles/Encryption_Algorithms.dir/sdes/subkey.c.s

CMakeFiles/Encryption_Algorithms.dir/des/des_util.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/des/des_util.c.o: ../des/des_util.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_12) "Building C object CMakeFiles/Encryption_Algorithms.dir/des/des_util.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/des/des_util.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/des/des_util.c

CMakeFiles/Encryption_Algorithms.dir/des/des_util.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/des/des_util.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/des/des_util.c > CMakeFiles/Encryption_Algorithms.dir/des/des_util.c.i

CMakeFiles/Encryption_Algorithms.dir/des/des_util.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/des/des_util.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/des/des_util.c -o CMakeFiles/Encryption_Algorithms.dir/des/des_util.c.s

CMakeFiles/Encryption_Algorithms.dir/des/keygen.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/des/keygen.c.o: ../des/keygen.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_13) "Building C object CMakeFiles/Encryption_Algorithms.dir/des/keygen.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/des/keygen.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/des/keygen.c

CMakeFiles/Encryption_Algorithms.dir/des/keygen.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/des/keygen.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/des/keygen.c > CMakeFiles/Encryption_Algorithms.dir/des/keygen.c.i

CMakeFiles/Encryption_Algorithms.dir/des/keygen.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/des/keygen.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/des/keygen.c -o CMakeFiles/Encryption_Algorithms.dir/des/keygen.c.s

CMakeFiles/Encryption_Algorithms.dir/des/des_feistel.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/des/des_feistel.c.o: ../des/des_feistel.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_14) "Building C object CMakeFiles/Encryption_Algorithms.dir/des/des_feistel.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/des/des_feistel.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/des/des_feistel.c

CMakeFiles/Encryption_Algorithms.dir/des/des_feistel.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/des/des_feistel.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/des/des_feistel.c > CMakeFiles/Encryption_Algorithms.dir/des/des_feistel.c.i

CMakeFiles/Encryption_Algorithms.dir/des/des_feistel.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/des/des_feistel.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/des/des_feistel.c -o CMakeFiles/Encryption_Algorithms.dir/des/des_feistel.c.s

CMakeFiles/Encryption_Algorithms.dir/des/des.c.o: CMakeFiles/Encryption_Algorithms.dir/flags.make
CMakeFiles/Encryption_Algorithms.dir/des/des.c.o: ../des/des.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_15) "Building C object CMakeFiles/Encryption_Algorithms.dir/des/des.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Encryption_Algorithms.dir/des/des.c.o   -c /home/andromeda/Embedded/Encryption-Algorithms/C/des/des.c

CMakeFiles/Encryption_Algorithms.dir/des/des.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Encryption_Algorithms.dir/des/des.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/andromeda/Embedded/Encryption-Algorithms/C/des/des.c > CMakeFiles/Encryption_Algorithms.dir/des/des.c.i

CMakeFiles/Encryption_Algorithms.dir/des/des.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Encryption_Algorithms.dir/des/des.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/andromeda/Embedded/Encryption-Algorithms/C/des/des.c -o CMakeFiles/Encryption_Algorithms.dir/des/des.c.s

# Object files for target Encryption_Algorithms
Encryption_Algorithms_OBJECTS = \
"CMakeFiles/Encryption_Algorithms.dir/main.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/substitution/caesar.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/substitution/monoalphabetic.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/substitution/vignere.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/substitution/autokey.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/transposition/railfence.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/transposition/rowtransposition.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_util.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_feistel.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/sdes/sdes.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/sdes/subkey.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/des/des_util.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/des/keygen.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/des/des_feistel.c.o" \
"CMakeFiles/Encryption_Algorithms.dir/des/des.c.o"

# External object files for target Encryption_Algorithms
Encryption_Algorithms_EXTERNAL_OBJECTS =

Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/main.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/substitution/caesar.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/substitution/monoalphabetic.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/substitution/vignere.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/substitution/autokey.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/transposition/railfence.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/transposition/rowtransposition.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_util.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/sdes/sdes_feistel.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/sdes/sdes.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/sdes/subkey.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/des/des_util.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/des/keygen.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/des/des_feistel.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/des/des.c.o
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/build.make
Encryption_Algorithms: CMakeFiles/Encryption_Algorithms.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_16) "Linking C executable Encryption_Algorithms"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Encryption_Algorithms.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Encryption_Algorithms.dir/build: Encryption_Algorithms

.PHONY : CMakeFiles/Encryption_Algorithms.dir/build

CMakeFiles/Encryption_Algorithms.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/Encryption_Algorithms.dir/cmake_clean.cmake
.PHONY : CMakeFiles/Encryption_Algorithms.dir/clean

CMakeFiles/Encryption_Algorithms.dir/depend:
	cd /home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/andromeda/Embedded/Encryption-Algorithms/C /home/andromeda/Embedded/Encryption-Algorithms/C /home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug /home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug /home/andromeda/Embedded/Encryption-Algorithms/C/cmake-build-debug/CMakeFiles/Encryption_Algorithms.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/Encryption_Algorithms.dir/depend

