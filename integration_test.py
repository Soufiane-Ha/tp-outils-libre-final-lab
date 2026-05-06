import subprocess

result = subprocess.run(
    ["gradlew.bat", "test"],
    capture_output=True,
    text=True
)

print(result.stdout)

if result.returncode == 0:
    print("Integration Test Passed")
else:
    print("Integration Test Failed")