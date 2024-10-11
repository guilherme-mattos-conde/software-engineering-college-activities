def inverter_string(s):
    return s[::-1]

def inverter_string_recursiva(s):
    if len(s) == 0:
        return s
    return s[-1] + inverter_string(s[:-1])

print(inverter_string('Radar'))
print(inverter_string_recursiva('Radar'))