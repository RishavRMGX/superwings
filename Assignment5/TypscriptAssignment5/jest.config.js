module.exports = {
    roots: ['./src/test'],
    transform: {
      '^.+\\.tsx?$': 'ts-jest',
    },
    collectCoverage: true,
    testRegex: '(/__tests__/.*|(\\.|/)(test|spec))\\.tsx?$',
    moduleFileExtensions: ['ts', 'tsx', 'js', 'jsx', 'json', 'node'],
  }