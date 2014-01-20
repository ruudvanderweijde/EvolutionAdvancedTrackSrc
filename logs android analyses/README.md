These are the results of the diff tool on the Android API sources.

The following folders are present:

withoutPattern - the initial diff results. The entire M3 is taken into account here, no filtering occurs
initalWhiteListPattern - We tried to use this pattern to filter out packages that were not in the JDiff results. Too much was ignored so it has been replaced by firstImprovedWhitelistPattern.
firstImprovedWhitelistPattern - Improvement of previous pattern, also took org/java/dalvik packages into account.
secondImprovedWhitelistPattern - Same as the previous pattern but explicitly filters out the Apache packages which are not present in the Android JDiff. Only api transitions which contained these packages were rerun.

Each of these folders contains log files for each API transition. The command is present at the top of these log files and contains the whitelist pattern used.