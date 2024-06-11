def to_check_length(items):
    if type(items) in [int, float]:
        raise ValueError("No argument")
    counter = 0
    for i in items:
        counter += 1
    return counter
