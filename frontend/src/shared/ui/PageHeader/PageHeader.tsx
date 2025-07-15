interface Props {
  homeText: string;
  homeSubText: string;
}

export function PageHeader({homeSubText, homeText}: Props) {
  return (
    <div className="flex-1/2 flex flex-col items-center">
      <span className="text-3xl text-red-500 font-sans">
        {homeText}
      </span>
      <span>{homeSubText}</span>
    </div>
  );
}
