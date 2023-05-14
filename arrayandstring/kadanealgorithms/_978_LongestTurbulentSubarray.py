def maxTurbulenceSize(arr):
    """
    :type arr: List[int]
    :rtype: int
    """
    l, r = 0, 1
    res, sign = 1, ""  # result list is non-empty and sign is declared as ""

    while r < len(arr):
        if arr[r-1] > arr[r] and sign != ">":
            res = max(res, r-l+1)
            r += 1
            sign = ">"

        elif arr[r-1] < arr[r] and sign != "<":
            res = max(res, r-l+1)
            r += 1
            sign = "<"

        else:
            r = r + 1 if arr[r] == arr[r-1] else r
            l = r - 1
            sign = ""
    return res

def main():
    arr = [9,4,2,10,7,8,8,1,9]
    print(maxTurbulenceSize(arr))

if __name__ == '__main__':
    main()