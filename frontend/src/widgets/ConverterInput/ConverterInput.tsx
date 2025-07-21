export function ConverterInput() {
  return (
    <div className="flex max-w-md mx-auto bg-gray-800 rounded-md shadow-sm overflow-hidden">
      <input
        type="text"
        placeholder="Введите текст"
        className="
      flex-grow
      bg-gray-800
      text-gray-100
      placeholder-gray-400
      px-4
      py-2.5
      focus:outline-none
      focus:ring-2
      focus:ring-indigo-500
      focus:border-indigo-500
      transition
      duration-200
      ease-in-out
    "
      />
      <button
        type="button"
        className="
        cursor-pointer
      bg-indigo-600
      hover:bg-indigo-700
      text-white
      font-medium
      px-5
      py-2.5
      transition
      duration-200
      ease-in-out
      focus:outline-none
      focus:ring-2
      focus:ring-indigo-400
      focus:ring-offset-1
      rounded-r-md
    "
      >
        Применить
      </button>
    </div>
  );
}
