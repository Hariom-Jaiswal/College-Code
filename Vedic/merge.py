def sort(array):
    if len(array)<=1:
        return array
    
    mid = len(array)//2
    left_h = array[:mid]
    right_h = array[mid:]

    left_sort=sort(left_h)
    right_sort=sort(right_h)

    return merge(left_sort,right_sort)

def merge(left,right):
    finalsorted = []
    i = j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            finalsorted.append(left[i])
            i += 1
        else:
            finalsorted.append(right[j])
            j += 1
    

    while i < len(left):
        finalsorted.append(left[i])
        i += 1
    
    while j < len(right):
        finalsorted.append(right[j])
        j += 1

    return finalsorted
        

array = [10,50,40,30,20]
result=sort(array)
print(result)